package slinkedlist;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class App {

    public static void main(String[] args) {
        SLinkedList sll = new SLinkedList();
        Node data1 = new Node("Data1");
        Node data2 = new Node("Data2");
        Node data3 = new Node("Data3");
        Node data4 = new Node("Data4");
        Node data5 = new Node("Data5");
        System.out.println("Nodes of Singly Linked List: ");
        System.out.println("Menambah Data3 di awal");
        sll.addFirst(data3);
        sll.display();
        System.out.println("Menambah Data4 di awal");
        sll.addFirst(data4);
        sll.display();
        System.out.println("Menambah Data1 di akhir");
        sll.addLast(data1);
        sll.display();
        System.out.println("Menambah Data2 di akhir");
        sll.addLast(data2);
        sll.display();
        System.out.println("Menambah Data5 di tengah");
        sll.addMiddle(data5);
        sll.display();

        System.out.println();

        System.out.println("Menghapus data di tengah");
        sll.deleteMiddle();
        sll.display();
        System.out.println("Menghapus data di awal");
        sll.deleteFirst();
        sll.display();
        System.out.println("Menghapus data di akhir");
        sll.deleteLast();
        sll.display();
    }
}
