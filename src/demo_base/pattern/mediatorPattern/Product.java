package demo_base.pattern.mediatorPattern;

public abstract class Product {
    Mediator mediator;

    Product(Mediator mediator) {
        mediator = mediator;
    }

    abstract Product assign(Student student,String scale);
}
