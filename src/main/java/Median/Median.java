package Median;

import java.util.*;

/**
 * Implementation of Running Median using arrays
 * Can handle unsorted input because at insertion
 * the element inserted in an sorted order in the array
 * Created by taha.
 */
public class Median {
    private int[] array;
    private int insertedElements;

    public Median(int size) {
        insertedElements = 0;
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i]=100000000; //initializing array with a large value
        }
    }

    /* Insertion in the array
     * Each new element is placed into the array according to
     * its lexicographical order
     */
    private int[] insert(int[] oldArr, int data) {
        int[] newArr = new int[oldArr.length + 1];
        int index = Arrays.binarySearch(oldArr, data);
        if (index < 0) {
            int insertIndex = -index - 1;
            //copy elements before insertIndex into the newArr
            System.arraycopy(oldArr, 0, newArr, 0, insertIndex);
            //copy elements after insertIndex into the newArr
            System.arraycopy(oldArr, insertIndex, newArr, insertIndex + 1,
                    oldArr.length - insertIndex);
            //insert new element in the array
            newArr[insertIndex] = data;
        }
        return newArr;
    }

    //Calculating median
    private float median(int [] array, int size) {
        float median;
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
        array = insert(array, data);
        float median = median(array,insertedElements);
        return median;
    }
}
