package Queue;

/**
 * Node Class used in the Queue
 * Created by taha.
 */
public class Node<T> {
    public T data;

    public Node<T>nextLink;

    public Node(T data) {

        this.data = data;

    }

    public String printNode() {
        String result  = data.toString();
        return result;
    }
}
