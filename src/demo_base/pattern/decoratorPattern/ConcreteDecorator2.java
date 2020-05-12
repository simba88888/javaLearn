package demo_base.pattern.decoratorPattern;

public class ConcreteDecorator2 extends Decorator {
    public ConcreteDecorator2(Compoment compoment) {
        super(compoment);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println(ConcreteDecorator2.class.getSimpleName()+" be called");
    }
}
