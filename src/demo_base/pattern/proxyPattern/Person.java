package demo_base.pattern.proxyPattern;

public class Person implements Animal {

    @Override
    public void eat() {
        ToolUtils.printAction(Person.class);
    }

    @Override
    public void run() {
        ToolUtils.printAction(Person.class);
    }
}
