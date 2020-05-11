package demo_base.pattern.observerPattern;

public class JavaObserverPatternDemo {
    public static void main(String[] args) {
        JavaObservable javaObservable = new JavaObservable("observable");
        javaObservable.addObserver(new JavaObserver("observer1"));
        javaObservable.addObserver(new JavaObserver("observer2"));
        javaObservable.addObserver(new JavaObserver("observer3"));

        javaObservable.setMessage("abservable1");
        System.out.println();
        javaObservable.setMessage("abservable2");

        /*
        observer3 : abservable1
        observer2 : abservable1
        observer1 : abservable1

        observer3 : abservable2
        observer2 : abservable2
        observer1 : abservable2
        */
    }
}
