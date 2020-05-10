package demo_base.pattern.abstractFactoryPattern;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}