package dlinkedlist;

/**
 *
 * @author Muhammad Rizki Syafapri <12050110483>
 */
public class Node {

    private String data;
    private Node previousReference;
    private Node nextReference;

    public Node(String data) {
        this.data = data;
        this.previousReference = null;
        this.nextReference = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getPreviousReference() {
        return previousReference;
    }

    public void setPreviousReference(Node previousReference) {
        this.previousReference = previousReference;
    }

    public Node getNextReference() {
        return nextReference;
    }

    public void setNextReference(Node nextReference) {
        this.nextReference = nextReference;
    }

}
