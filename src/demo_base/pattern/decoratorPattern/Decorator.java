package demo_base.pattern.decoratorPattern;

public abstract class Decorator implements Compoment{
    private Compoment compoment;

    public Decorator(Compoment compoment) {
        this.compoment = compoment;
    }

    @Override
    public void operation() {
        compoment.operation();
    }
}



