package dlinkedlist;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class DLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public DLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return (this.head == null) && (this.tail == null);
    }

    // Menambahkan Node di awal
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            head.setPreviousReference(null);
            tail.setNextReference(null);
        } else {
            head.setPreviousReference(newNode);
            newNode.setNextReference(head);
            newNode.setPreviousReference(null);
            head = newNode;
        }
        this.size++;
    }

    // Menambahkan Node di tengah
    public void addMiddle(String data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            head.setPreviousReference(null);
            tail.setNextReference(null);
        } else {
            Node pointer = head, temp = null;
            int middle = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
            for (int i = 1; i < middle; i++) {
                pointer = pointer.getNextReference();
            }
            temp = pointer.getNextReference();
            temp.setPreviousReference(pointer);
            pointer.setNextReference(newNode);
            newNode.setPreviousReference(pointer);
            newNode.setNextReference(temp);
            temp.setPreviousReference(newNode);
        }
        this.size++;
    }

    // Menambahkan Node di akhir
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            head.setPreviousReference(null);
            tail.setNextReference(null);
        } else {
            tail.setNextReference(newNode);
            newNode.setPreviousReference(tail);
            tail = newNode;
            tail.setNextReference(null);
        }
        this.size++;
    }

    // Menghapus Data di awal
    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        } else {
            if (head != tail) {
                head = head.getNextReference();
                head.setPreviousReference(null);
            } else {
                head = tail = null;
            }
        }
        this.size--;
    }

    // Menghapus Data di tengah
    public void deleteMiddle() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        } else {
            Node pointer = head;
            int mid = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
            for (int i = 1; i < mid; i++) {
                pointer = pointer.getNextReference();
            }
            if (pointer == head) {
                head = pointer.getNextReference();
            } else if (pointer == tail) {
                tail = tail.getPreviousReference();
            } else {
                pointer.setPreviousReference(pointer.getNextReference());
                pointer.setNextReference(pointer.getPreviousReference());
            }
            pointer = null;
        }
        this.size--;
    }

    // Menghapus Data di akhir
    public void deleteLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        } else {
            if (head != tail) {
                tail = tail.getPreviousReference();
                tail.setNextReference(null);
            } else {
                head = tail = null;
            }
        }
        this.size--;
    }

    public void display() {
        Node pointer = head;
        System.out.println("Size :" + this.getSize());
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }
        while (pointer != null) {
            System.out.print(pointer.getData() + "\t");
            pointer = pointer.getNextReference();
        }
        System.out.println();
    }
}
