import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by taha on 3/29/17.
 */
public class QueueTest {

    @Test
    public void testEmptyQueue(){
        Queue<Integer> q = new Queue<Integer>();
        assertTrue(q.isEmpty());
        assertEquals(q.size(), 0);
    }

    @Test
    public void testEnqueueThenDequeue() {
        Queue<String> q = new Queue<String>();
        String message = "hello";
        q.enqueue(message);
        assertEquals(q.dequeue(), message);
    }

    @Test
    public void testEnqueueThenPeek() {
        Queue<Integer> q = new Queue<Integer>();
        q.enqueue(45);
        int size = q.size();
        assertEquals(q.peek(), 45);
        assertEquals(q.size(), size);
    }

    @Test
    public void testFiftyInThenFiftyOut() {
        Queue<Integer> q = new Queue<Integer>();
        for (int i = 0; i < 50; i++) {
            q.enqueue(i);
        }
        for (int i = 0; i < 50; i++) {
            assertEquals(q.dequeue(), i);
        }
    }

    @Test
    public void testRemovingDownToEmpty() {
        Queue<Integer> q = new Queue<Integer>();
        int numberOfRemoves = (int)(Math.random() * 20 + 1);
        for (int i = 0; i < numberOfRemoves; i++) {
            q.enqueue(i);
        }
        for (int i = 0; i < numberOfRemoves; i++) {
            q.dequeue();
        }
        assertTrue(q.isEmpty());
        assertEquals(q.size(), 0);
    }
    @Test
    public void testRemoveOnEmptyQueue() {
        Queue<Integer> q = new Queue<Integer>();
        assertTrue(q.isEmpty());
        q.dequeue();
    }


}
