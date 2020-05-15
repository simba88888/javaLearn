package demo_base.pattern.chainOfResponsibilityPattern;

public class UserService {
    public static boolean exists(String email, String password) {
        if ("admin@example.com".equals(email)) {
            return true;
        }else {
            return false;
        }
    }
}
