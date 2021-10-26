package slinkedlist;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class SLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public SLinkedList() {
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
    public void addFirst(Node node) {
        if (!isEmpty()) {
            Node temp = head;
            head = node;
            head.setNextReference(temp);
        } else {
            node.setNextReference(null);
            tail = node;
            head = node;
        }
        this.size++;
    }

    // Menambahkan Node di tengah
    public void addMiddle(Node node) {
        if (!isEmpty()) {
            Node temp, pointer;
            int middle = (getSize() % 2 == 0) ? (getSize() / 2) : ((getSize() + 1) / 2);
            temp = head;
            pointer = null;
            for (int i = 0; i < middle; i++) {
                pointer = temp;
                temp = temp.getNextReference();
            }
            pointer.setNextReference(node);
            node.setNextReference(temp);
        } else {
            node.setNextReference(null);
            tail = node;
            head = node;
        }
        this.size++;
    }

    // Menambahkan Node di akhir
    public void addLast(Node node) {
        if (!isEmpty()) {
            node.setNextReference(null);
            this.tail.setNextReference(node);
            tail = node;
        } else {
            node.setNextReference(null);
            tail = node;
            head = node;
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
            } else {
                head = tail = null;
            }
        }
        this.size--;
    }

    // Menghapus Data di tengah
    public void deleteMiddle() {
        Node temp, pointer;
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        } else {
            int middle = (getSize() % 2 == 0) ? (getSize() / 2) : ((getSize() + 1) / 2);
            if (head != tail) {
                temp = head;
                pointer = null;
                for (int i = 0; i < middle - 1; i++) {
                    pointer = temp;
                    temp = temp.getNextReference();
                }
                if (pointer != null) {
                    pointer.setNextReference(temp.getNextReference());
                    temp = null;
                } else {
                    head = tail = temp.getNextReference();
                    temp = null;
                }
            } else {
                head = tail = null;
            }
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
                Node pointer = head;
                while (pointer.getNextReference() != tail) {
                    pointer = pointer.getNextReference();
                }
                tail = pointer;
                tail.setNextReference(null);
            } else {
                head = tail = null;
            }
        }
        this.size--;
    }

    public void display() {
        Node pointer;
        pointer = head;
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
