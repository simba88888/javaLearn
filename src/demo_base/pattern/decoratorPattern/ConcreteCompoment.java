package demo_base.pattern.decoratorPattern;

public class ConcreteCompoment implements Compoment {
    @Override
    public void operation() {
        System.out.println(ConcreteCompoment.class.getSimpleName() + "be called");
    }
}




