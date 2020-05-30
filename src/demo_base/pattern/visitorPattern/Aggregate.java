package demo_base.pattern.visitorPattern;

public interface Aggregate<E> {
    boolean add(E item);

    boolean remove(E item);

    Iterator getIterator();

    void visitorAll(Visitor visitor);
}
