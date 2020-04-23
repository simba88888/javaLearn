package demo_base.pattern.proxyPattern;

public class Monkey implements Animal {
    @Override
    public void eat() {
        ToolUtils.printAction(Monkey.class);
    }

    @Override
    public void run() {
        ToolUtils.printAction(Monkey.class);
    }
}
