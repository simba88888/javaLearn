package demo_base.pattern.chainOfResponsibilityPattern;

import java.io.IOException;

public class ChainOfResponsibilityExample {
    public static void main(String[] args) throws IOException {
        Middleware middleware = new UserExistsMiddleware();
        middleware.linkWith(new RoleCheckMiddleware());

        boolean canUserLoginAsAdmin = middleware.check("admin@example.com", "S3cret");
        boolean canUserLoginAsError = middleware.check("admin@example.1com", "S3cret");
        System.out.println("canUserLoginAsAdmin: "+canUserLoginAsAdmin);
        System.out.println("canUserLoginAsError: "+canUserLoginAsError);
    }
}

abstract class Middleware {
    private Middleware next;

    public Middleware linkWith(Middleware next) {
        this.next = next;
        return next;
    }

    public abstract boolean check(String email, String password);

    protected boolean checkNext(String email, String password) {
        if (next == null) {
            return true;
        }
        return next.check(email, password);
    }
}

class UserExistsMiddleware extends Middleware {
    public boolean check(String email, String password) {
        if (!UserService.exists(email, password)) {
            return false;
        }
        return checkNext(email, password);
    }
}

class RoleCheckMiddleware extends Middleware {
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("Hello, admin!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
