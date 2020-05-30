package demo_base.pattern.visitorPattern;

interface Iterator<E> {
    E first();

    boolean hasNext();

    E next();
}