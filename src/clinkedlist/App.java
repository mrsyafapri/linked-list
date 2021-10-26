package clinkedlist;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class App {

    public static void main(String[] args) {
        CLinkedList cll = new CLinkedList();
        System.out.println("Nodes of the Circular Linked List: ");
        cll.addFirst("Data1");
        cll.addLast("Data3");
        cll.addMiddle("Data2");
        System.out.println("Data sebelum dihapus");
        cll.display();

        System.out.println();

        cll.deleteFirst();
        cll.deleteMiddle();
        cll.deleteLast();
        System.out.println("Data sesudah dihapus");
        cll.display();
    }
}
