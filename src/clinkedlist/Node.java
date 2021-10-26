package clinkedlist;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class Node {

    private String data;
    private Node nextReference;

    public Node(String data) {
        this.data = data;
        this.nextReference = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNextReference() {
        return nextReference;
    }

    public void setNextReference(Node nextReference) {
        this.nextReference = nextReference;
    }
}
