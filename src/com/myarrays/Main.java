/**
 *  Java program to sort the array in increasing order of numbers with Arrays.sort() method.
 */

package com.myarrays;

import java.util.Arrays;

/**
 *  Main class.
 */
public class Main {

    // JVM entry point.
    public static void main(String[] args) {

        // Creating an array of long numbers.
        long[] array = {1234567890L, 987654321L, 876543L, 11122222333L};

        // Sorting the array.
        Arrays.sort(array);

        // Printing the sorted array to console.
        System.out.println(Arrays.toString(array));

    }
}