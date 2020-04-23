package demo_base.pattern.proxyPattern;

public class ToolUtils {
    public ToolUtils() {
    }

    public static void printAction(Class clazz) {
        System.out.println("This " + clazz.getSimpleName() + " is " + Thread.currentThread().getStackTrace()[2].getMethodName() + "ing.");
    }
}
