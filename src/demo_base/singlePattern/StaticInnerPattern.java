package demo_base.singlePattern;

public class StaticInnerPattern {

    private StaticInnerPattern() {
    }

    private static class SingletonHolder {
        private static final StaticInnerPattern INSTANCE = new StaticInnerPattern();
    }

    public static StaticInnerPattern getUniqueInstance() {
        return SingletonHolder.INSTANCE;
    }
}

