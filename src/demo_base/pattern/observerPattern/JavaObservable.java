package demo_base.pattern.observerPattern;

import java.util.Observable;

public class JavaObservable extends Observable {
    private String message;

    public JavaObservable(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        this.setChanged();
        this.notifyObservers(message);
    }
}


