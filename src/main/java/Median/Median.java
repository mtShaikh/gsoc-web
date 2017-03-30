package Median;

import java.util.*;

/**
 * Created by taha on 3/29/17.
 */
public class Median {
    private int[] array;
    private int insertedElements;

    public Median(int size) {
        insertedElements = 0;
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=100000000;
        }
    }

    private int[] insert(int[] oldArr, int data) {
        int[] newArr = new int[oldArr.length + 1];
        int index = Arrays.binarySearch(oldArr, data);
        if (index < 0) {
            int insertIndex = -index - 1;
            System.arraycopy(oldArr, 0, newArr, 0, insertIndex);
            System.arraycopy(oldArr, insertIndex, newArr, insertIndex + 1,
                    oldArr.length - insertIndex);
            newArr[insertIndex] = data;
           // oldArr = newArr;
        }
        return newArr;
    }

    public float median(int [] array, int size) {
        float median = 0;
        if ((size % 2) == 0) {
            median =  array[size / 2] + array[(size / 2)-1];
            median = median / 2;
            return median;
        } else {
            median = array[size / 2];
            return median;
        }
    }

    public float returnMedianOnInsert(int data) {
        insertedElements++;
       // int [] tempArr = new int[size];
        array = insert(array, data);
        float median = median(array,insertedElements);
        return median;
    }
}
