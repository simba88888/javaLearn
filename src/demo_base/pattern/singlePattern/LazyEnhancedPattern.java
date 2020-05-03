package demo_base.pattern.singlePattern;

public class LazyEnhancedPattern {
    private static LazyEnhancedPattern lazyPattern;
    private static int initNum = 0;

    private LazyEnhancedPattern() {
        System.out.println("LazyPattern initialization :" + ++initNum);
    }

    public static synchronized LazyEnhancedPattern getSimpleInstance() {
        if (lazyPattern == null)
            lazyPattern = new LazyEnhancedPattern();
        return lazyPattern;
    }
}


