package Queue;

import org.junit.Test;

import static org.junit.Assert.*;
/**
 * Test file for Queue
 * Created by taha.
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
        assertEquals(q.dequeue().data, message);
    }

    @Test
    public void testEnqueueThenPeek() {
        Queue<Integer> q = new Queue<Integer>();
        Integer in = 45;
        q.enqueue(in);
        int size = q.size();
        assertEquals(q.peek(), in.toString());
        assertEquals(q.size(), size);
    }

    @Test
    public void testFiftyInThenFiftyOut() {
        Queue<Integer> q = new Queue<Integer>();
        for (int i = 0; i < 50; i++) {
            q.enqueue(i);
        }
        for (int i = 0; i < 50; i++) {
            Integer in = i;
            assertEquals(q.dequeue().data, in);
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

}
