package hashset;


public class CustomHashSet<T> implements ISet<T> {
    private final static int DEFAULT_INITIAL_CAPACITY = 10;
    Node[] nodes;
    int size;

    public CustomHashSet() {
        nodes = new Node[DEFAULT_INITIAL_CAPACITY];
        size = 0;
    }
    public int getHash(T element) {
        return element.hashCode() % nodes.length;
    }
    @Override
    public boolean add(T element) {
        if (element == null) {
            return false;
        }
        if (size == nodes.length) {
            resize();
        }
        int bucketIndex = getHash(element);
        Node current = nodes[bucketIndex];
        while (current != null) {
            if (current.data.equals(element)) {
                return false;
            }
            current = current.next;
        }
        // if current node is empty then add element
        Node newNode = new Node(element);
        nodes[bucketIndex] = newNode;
        // if current node is not empty then add to next
        nodes[bucketIndex].next = newNode;
        size++;
        return true;
    }

    @Override
    public boolean contains(T element) {
        if (element == null) {
            return false;
        }
        int bucketIndex = getHash(element);
        Node current = nodes[bucketIndex];
        while (current != null) {
            if (current.data.equals(element)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public void remove(T element) {
        int bucketIndex = getHash(element);
        Node current = nodes[bucketIndex];
        while (current != null) {
            if (current.data.equals(element)) {
                nodes[bucketIndex] = null;
                return;
            }
            current = current.next;
        }
        size--;

    }

    @Override
    public int size() {
        return size;
    }
    private void resize() {
        int newCapacity = (int) ((DEFAULT_INITIAL_CAPACITY * 1.5) + 1);
        Node[] newNodes = new Node[newCapacity];
        for (int i = 0; i < size; i++) {
            newNodes[i] = nodes[i];
        }
        nodes = newNodes;
    }
}

