package arraylist;

public class List implements iList {
    private int size;
    private Object[] list;

    public List()  {
        list = new Object[10];
        size = 0;

    }
    public Object get(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        return list[index];
    }
    @Override
    public void add(int index, Object value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
        if (size == list.length) {
            resize();
        }
        list[index] = value;
        size++;
    }
    @Override
    public void remove(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        Object temp = list[index];
        for (int i = 0; i < size; i++) {
            if (list[i] == temp) {
                list[i] = list[i+1];
            }
        }
        size--;
    }
    public void resize() {
        int newSize = (int) ((size * 1.5) + 1);
        Object[] newList = new Object[newSize];
        for (int i = 0; i < size; i++) {
            newList[i] = list[i];
        }
        list = newList;
    }
    public int size() {
        return size;
    }

}
