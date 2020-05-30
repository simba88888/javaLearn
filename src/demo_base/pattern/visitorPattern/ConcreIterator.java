package demo_base.pattern.visitorPattern;

public class ConcreIterator<E> implements Iterator<E> {
    private E[] list;

    private int index = 0;

    public ConcreIterator(E[] list) {
        this.list = list;
    }

    @Override
    public E first() {
        return list[0];
    }

    @Override
    public boolean hasNext() {
        if (index <= list.length-1) {
            return true;
        }
        return false;
    }

    @Override
    public E next() {
        return list[index++];
    }
}
