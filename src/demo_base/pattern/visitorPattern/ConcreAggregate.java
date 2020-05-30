package demo_base.pattern.visitorPattern;

public class ConcreAggregate<E> implements Aggregate<E> {
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

    @Override
    public void visitorAll(Visitor visitor) {
        Iterator<E> iterator = getIterator();
        while (iterator.hasNext()) {
            ((Element)iterator.next()).acceptVisitor(visitor);
        }
    }
}
