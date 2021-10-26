package clinkedlist;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class CLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public CLinkedList() {
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
            head = newNode;
            tail = newNode;
            newNode.setNextReference(head);
        } else {
            Node temp = head;
            newNode.setNextReference(temp);
            head = newNode;
            tail.setNextReference(head);
        }
        this.size++;
    }

    // Menambahkan Node di tengah
    public void addMiddle(String data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.setNextReference(head);
        } else {
            Node temp, pointer;
            int middle = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
            temp = head;
            pointer = null;
            for (int i = 0; i < middle; i++) {
                pointer = temp;
                temp = temp.getNextReference();
            }
            pointer.setNextReference(newNode);
            newNode.setNextReference(temp);
        }
        this.size++;
    }

    // Menambahkan Node di akhir
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            newNode.setNextReference(head);
        } else {
            tail.setNextReference(newNode);
            tail = newNode;
            tail.setNextReference(head);
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
                tail.setNextReference(head);
            } else {
                head = tail = null;
            }
        }
        this.size--;
    }

    // Menghapus Data di tengah
    public void deleteMiddle() {
        Node pointer, temp;
        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        } else {
            int middle = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
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
                    tail.setNextReference(head);
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
            //Checks whether contain only one element  
            if (head != tail) {
                Node pointer = head;
                while (pointer.getNextReference() != tail) {
                    pointer = pointer.getNextReference();
                }
                tail = pointer;
                tail.setNextReference(head);
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
        } else {
            do {
                System.out.print(pointer.getData() + "\t");
                pointer = pointer.getNextReference();
            } while (pointer != head);
            System.out.println();
        }
    }
}
