/**
 * Created by taha on 3/27/17.
 */
public class Queue<T> {
    private Node<T> head;
    public Queue(){
        head = null;
    }
    public boolean isEmpty() {
        return head == null;
    }
    public void enqueue(T data){
        Node <T> link = new Node<T>(data);
        Node current = head;
        if(this.isEmpty()){
            head = link;
        }
        else {
            while(current.nextLink != null){
                current = current.nextLink;
            }
            current.nextLink = link;
        }
    }

    public Node<T> dequeue(){
        Node dequeued = head;
        head = head.nextLink;
        return dequeued;
    }

    public String peek() {
        return head.printNode();
    }

    public int size() {
        int count = 0;
        for (Node node = head; node != null; node = node.nextLink) {
            count++;
        }
        return count;
    }

}
