package demo_base.pattern.proxyPattern;

public class Computer implements Machine {
    @Override
    public void compute() {
        ToolUtils.printAction(Computer.class);
    }

    @Override
    public void produceHot() {
        ToolUtils.printAction(Computer.class);
    }
}
