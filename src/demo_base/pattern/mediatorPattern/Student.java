package demo_base.pattern.mediatorPattern;

public abstract class Student {
    Mediator mediator;

    Student(Mediator mediator) {
        mediator = mediator;
    }

    abstract Product needHouse(String scale);

}
