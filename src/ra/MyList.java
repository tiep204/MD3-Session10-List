package ra;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object object[];

    public MyList() {
        object = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = object.length * 2;
        object = Arrays.copyOf(object, newSize);
    }

    public void add(E e) {
        if (size == object.length) {
            ensureCapa();
        }
        object[size++] = e;
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("index: " + i + ", Size " + i);
        }
        return (E) object[i];
    }
}