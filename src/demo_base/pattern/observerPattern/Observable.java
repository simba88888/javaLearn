package demo_base.pattern.observerPattern;

public interface Observable {
    void beSubscribe(Observer observer);
    void beUnSubscribe(Observer observer);
}
