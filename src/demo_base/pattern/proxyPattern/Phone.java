package demo_base.pattern.proxyPattern;

public class Phone implements Machine {
    @Override
    public void compute() {
        ToolUtils.printAction(Phone.class);
    }

    @Override
    public void produceHot() {
        ToolUtils.printAction(Phone.class);
    }
}
