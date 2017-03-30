package Median;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by taha on 3/29/17.
 */
public class MedianMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num_of_commands = scanner.nextInt();
        float [] output = new float [num_of_commands];
        Median median = new Median(num_of_commands);
        for (int i = 0; i < num_of_commands; i++) {
            //int in = scanner.nextInt();
           output[i] = median.returnMedianOnInsert(i);
        }
        System.out.println(Arrays.toString(output));
    }
}
