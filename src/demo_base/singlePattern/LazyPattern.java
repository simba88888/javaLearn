package demo_base.singlePattern;

public class LazyPattern {
    private static LazyPattern lazyPattern;
    private static int initNum = 0;

    private LazyPattern() {
        System.out.println("LazyPattern initialization :"+ ++initNum);
    }

    public static LazyPattern getSimpleInstance() {
        // 线程不安全
        if (lazyPattern == null)
            lazyPattern = new LazyPattern();
        return lazyPattern;
    }
}
