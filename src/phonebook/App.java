package phonebook;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Phone Book App by Muhammad Rizki Syafapri");
        Node data1 = new Node("Rizki \t 085274959679 \t +62");
        Node data2 = new Node("Rahmad \t 081234567890 \t +62");
        Node data3 = new Node("Aziz \t 085212345678 \t +62");
        Node data4 = new Node("Fauzan \t 082312345678 \t +62");
        Node data5 = new Node("Eka \t 089876543210 \t +62");
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addFirst(data1);
        phoneBook.addLast(data5);
        phoneBook.addMiddle(data3);
        phoneBook.addFirst(data2);
        phoneBook.addLast(data4);
        System.out.println("Phone Book (data) setelah ditambahkan: ");
        phoneBook.display();

        phoneBook.deleteMiddle();
        phoneBook.deleteFirst();
        phoneBook.deleteLast();
        System.out.println("Phone Book (data) setelah dihapus: ");
        phoneBook.display();
    }
}
