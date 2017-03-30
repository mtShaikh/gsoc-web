package median;

import Median.Median;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;
/**
 * Created by taha on 3/30/17.
 */
public class MedianTest {
    private static final float DELTA = 1e-15f;

    @Test
    public void unsortedInsertion(){
         int [] arrayToInsert = {4,5,10,8};
         Median median = new Median(arrayToInsert.length);
        float [] outputMedian = new float[4];
        for (int i = 0; i <arrayToInsert.length ; i++) {
             outputMedian[i] = median.returnMedianOnInsert(arrayToInsert[i]);
        }
           float [] expectedValue  = {4,4.5f,5,6.5f};
           assertArrayEquals(outputMedian,expectedValue,DELTA);
    }

    @Test
    public void sortedInsertion(){
        int [] arrayToInsert = {4,5,7,8};
        Median median = new Median(arrayToInsert.length);
        float [] outputMedian = new float[4];
        for (int i = 0; i <arrayToInsert.length ; i++) {
            outputMedian[i] = median.returnMedianOnInsert(arrayToInsert[i]);
        }
        float [] expectedValue  = {4,4.5f,5,6};
        assertArrayEquals(outputMedian,expectedValue,DELTA);
    }
    @Test
    public void largeInsertion(){
        int [] arrayToInsert = new int[50];
        for (int i = 0; i < 50; i++) {
            arrayToInsert[i] = i;
        }
        Median median = new Median(arrayToInsert.length);
        float [] outputMedian = new float[50];
        for (int i = 0; i <arrayToInsert.length ; i++) {
            outputMedian[i] = median.returnMedianOnInsert(arrayToInsert[i]);
        }
        float [] expectedValue  = {0.0f, 0.5f, 1.0f, 1.5f, 2.0f, 2.5f, 3.0f, 3.5f, 4.0f, 4.5f,
                                   5.0f, 5.5f, 6.0f, 6.5f, 7.0f, 7.5f, 8.0f, 8.5f, 9.0f, 9.5f,
                                   10.0f, 10.5f, 11.0f, 11.5f, 12.0f, 12.5f, 13.0f, 13.5f,
                                   14.0f, 14.5f, 15.0f, 15.5f, 16.0f, 16.5f, 17.0f, 17.5f,
                                   18.0f, 18.5f, 19.0f, 19.5f, 20.0f, 20.5f, 21.0f, 21.5f,
                                   22.0f, 22.5f, 23.0f, 23.5f, 24.0f, 24.5f};
        assertArrayEquals(outputMedian,expectedValue,DELTA);
    }

}
