package demo_base.pattern.singlePattern;

public class HungryPattern {
    private static HungryPattern hungryPattern = new HungryPattern();
    private static int initNum = 1;

    private HungryPattern() {
        System.out.println("HungryPattern initialization :" + ++initNum);
    }

    public static HungryPattern getSimpleInstance() {
        return hungryPattern;
    }
}






