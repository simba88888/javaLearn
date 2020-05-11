package demo_base.pattern.observerPattern;

import java.util.Observable;
import java.util.Observer;

public class JavaObserver implements Observer {
    private String name;

    public JavaObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(name + " : " + arg);
    }
}
