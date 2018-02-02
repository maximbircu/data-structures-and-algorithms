package datastructures.linear.arraylist;

public class MyArrayList<E> {
    Object[] data;

    private int size = 0;
    private int capacity = 1;

    public MyArrayList() {
        data = new Object[capacity];
    }

    public MyArrayList(int initialCapacity) {
        capacity = initialCapacity;
        data = new Object[capacity];
    }

    public void add(E element) {
        if (size == capacity - 1) {
            extendCapacity();
        }
        data[size++] = element;
    }

    public E get(int index) {
        checkRange(index);
        return (E) data[index];
    }

    public void remove(int index) {
        checkRange(index);
        Object[] newArray = new Object[size - 1];
        System.arraycopy(data, 0, newArray, 0, size - 1);
        data[size--] = null;
        data = newArray;
    }

    public int size() {
        return size;
    }

    private void checkRange(int index) {
        if (index >= 0 && index >= size)
            throw new IndexOutOfBoundsException();
    }

    private void extendCapacity() {
        capacity *= 2;
        Object[] newData = new Object[capacity];
        System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
}
