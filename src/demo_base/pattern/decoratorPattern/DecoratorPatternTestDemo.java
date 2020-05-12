package demo_base.pattern.decoratorPattern;

public class DecoratorPatternTestDemo {
    public static void main(String[] args) {
        ConcreteCompoment compoment = new ConcreteCompoment();
        ConcreteDecorator1 concreteDecorator1 = new ConcreteDecorator1(compoment);
        ConcreteDecorator2 concreteDecorator2 = new ConcreteDecorator2(compoment);

        concreteDecorator1.operation();
        System.out.println();
        concreteDecorator2.operation();

       /* ConcreteCompomentbe called
        ConcreteDecorator1 be called

        ConcreteCompomentbe called
        ConcreteDecorator2 be called*/
    }
}



