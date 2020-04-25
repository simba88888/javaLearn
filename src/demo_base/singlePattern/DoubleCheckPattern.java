package demo_base.singlePattern;

public class DoubleCheckPattern {
    private static volatile DoubleCheckPattern single;
    private DoubleCheckPattern(){

    }
    public static DoubleCheckPattern getInstance() {
        if (single == null) {
            synchronized (DoubleCheckPattern.class) {
                if (single == null) {
                    single = new DoubleCheckPattern();
                }
            }
        }
        return single;
    }
}
