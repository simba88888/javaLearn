package demo_base.pattern.decoratorPattern;

public class ConcreteDecorator1 extends Decorator {
    public ConcreteDecorator1(Compoment compoment) {
        super(compoment);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println(ConcreteDecorator1.class.getSimpleName()+" be called");
    }
}


