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
         int [] arrayToInsert = {4,5,7,8};
         Median median = new Median(arrayToInsert.length);
        float [] outputMedian = new float[4];
        for (int i = 0; i <arrayToInsert.length ; i++) {
             outputMedian[i] = median.returnMedianOnInsert(arrayToInsert[i]);
        }
           float [] expectedValue  = {4,4.5f,5,6};
           assertArrayEquals(outputMedian,expectedValue,DELTA);
    }

}
