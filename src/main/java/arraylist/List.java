package arraylist;

public class List {
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
    public void add(int index, Object value) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
        }
        if (size == list.length) {
            resize();
        }
        list[index] = value;
        size++;
        System.out.println(list[index]);
    }
    public Object remove(int index) {
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
        return temp;
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
