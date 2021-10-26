package dlinkedlist;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class App {

    public static void main(String[] args) {
        DLinkedList dll = new DLinkedList();
        System.out.println("Nodes of Doubly Linked List: ");
        dll.addLast("Data3");
        dll.addFirst("Data1");
        dll.addMiddle("Data2");
        System.out.println("Data sebelum dihapus");
        dll.display();

        System.out.println();

        dll.deleteFirst();
        dll.deleteMiddle();
        dll.deleteLast();
        System.out.println("Data sesudah dihapus");
        dll.display();
    }
}
