package Queue;

/**
 * Created by taha on 3/28/17.
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
