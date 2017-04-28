package main.java.Sorts;

import sun.nio.ch.SelChImpl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Jordan on 4/27/2017.
 *
 * Sorts in descending order
 */


public class SelectionSort {

    public static void calculate2(int[] array) {

        int i, j, index, temp;

        for (i = 0; i < array.length-1; i++) {

            index = i;
            for (j = i + 1; j < array.length; j++) {

                if (array[j] < array[index]) {
                    index = j;
                }
            }

            // swap for new highest
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;

            System.out.println(Arrays.toString(array));


        }
    }

    public static void calculate (int[] array) {

        // exhaustive iterators, index for smallest/largest value, temp for swapping
        int i, j, index, temp;


        for (i = array.length-1; i > 0; i--) {
            index = 0; // need to reset index back to zero each iteration

            for (j = 1; j <= i ; j++) {
                if(array[j] < array[index]) {
                    index = j;
                }
            }


            temp = array[index];
            array[index] = array[i];
            array[i] = temp;

        }

            // swap out the new largest/smallest


        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        System.out.println("Test");
        int[] array = {84, 69, 100, 25, 22 , -2, 50, 93};
        System.out.println(Arrays.toString(array));
        // calculate(array);
        calculate2(array);


    }
}
