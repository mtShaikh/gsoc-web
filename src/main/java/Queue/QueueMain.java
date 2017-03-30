package Queue;


import java.util.Scanner;

/**
 * main file for Queue
 * Created by taha
 */
public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();
        Scanner scanner = new Scanner(System.in);
        int num_of_commands = scanner.nextInt();
        int i = 0;
        int previous_in = 0;
        while ((scanner.hasNextInt())) {
            int in = scanner.nextInt();
            if (in == 1) {
                previous_in = 1;
                continue;
            } else if (in == 2 && previous_in != 1) {
                queue.dequeue();
            } else if (in == 3 && previous_in != 1) {
                System.out.println(queue.peek());
            } else if (previous_in == 1) {
                queue.enqueue(in);
                previous_in = 0;
            }
            i++;
            if(i==num_of_commands){
                break;
            }
        }
    }
}

