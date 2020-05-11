package demo_base.pattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class DataSource implements Observable {
    private List<Observer> observers;
    private String data;

    public DataSource() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void beSubscribe(Observer observer) {
        observers.add(observer);
    }

    public void setData(String data) {
        this.data = data;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }



    public String felchData() {
        return this.data;
    }


    @Override
    public void beUnSubscribe(Observer observer) {
        observers.remove(observer);
    }
}
