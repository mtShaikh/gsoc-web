package Queue;

/**
 * Implemetation of Queue using a linked list
 * Created by taha
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
        Node<T> link = new Node<T>(data);
        Node current = head;
        if(this.isEmpty()){
            head = link;
        }
        else {
            //traverse to last node-->tail and insert
            while(current.nextLink != null){
                current = current.nextLink;
            }
            current.nextLink = link;
        }
    }

    public Node<T> dequeue(){
        if(isEmpty()){
            System.out.println("Queue already empty");
            return null;
        }
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
