package demo_base.pattern.iteratorPattern;

interface Iterator<E> {
    E first();

    boolean hasNext();

    E next();
}

class ConcreIterator<E> implements Iterator<E> {
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

interface Aggragate<E> {
    boolean add(E item);

    boolean remove(E item);

    Iterator getIterator();
}


class ConcreAggregate<E> implements Aggragate<E> {
    private int index;
    private final Object[] list;
    private int size;

    public ConcreAggregate(int size) {
        this.list = new Object[size];
        this.size = size;
    }

    private boolean isExceed() {
        if (index > list.length - 1) {
            return false;
        }
        return true;
    }

    @Override
    public boolean add(E item) {
        if (isExceed()) {
            list[index++] = item;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean remove(E item) {
        if (item == null) {
            for (int index = 0; index < size; index++)
                if (list[index] == null) {
                    fastRemove(index);
                    return true;
                }
        } else {
            for (int index = 0; index < size; index++)
                if (item.equals(list[index])) {
                    fastRemove(index);
                    return true;
                }
        }
        return false;
    }

    private void fastRemove(int index) {
        int numMoved = size - index - 1;
        if (numMoved > 0)
            System.arraycopy(list, index + 1, list, index,
                    numMoved);
        list[--size] = null; // clear to let GC do its work
    }


    @Override
    public Iterator getIterator() {
        return new ConcreIterator(list);
    }
}


public class IteratorPatternDemoTest {
    public static void main(String[] args) {
        Aggragate<String> list = new ConcreAggregate<>(5);
        String test = "yangbin1";
        System.out.println(list.add(test));
        System.out.println(list.add("yangbin2"));
        System.out.println(list.add("yangbin3"));
        System.out.println(list.add("yangbin4"));
        System.out.println(list.add("yangbin5"));
        Iterator iterator = list.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        System.out.println(list.remove(test));
        Iterator iterator2 = list.getIterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
/*
        true
        true
        true
        true
        true
        yangbin1
        yangbin2
        yangbin3
        yangbin4
        yangbin5

        true
        yangbin2
        yangbin3
        yangbin4
        yangbin5
        null*/
    }
}
