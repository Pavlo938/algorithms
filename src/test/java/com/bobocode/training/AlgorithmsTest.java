package com.bobocode.training;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlgorithmsTest {

    @Test
    void insertionSort() {
        int[] arrayToSort = {20, 1, 3, 50, 4, 2};
        int[] sortedArray = {1, 2, 3, 4, 20, 50};

        InsertionSort.sort(arrayToSort);
        Assertions.assertArrayEquals (arrayToSort, sortedArray);
    }

    @Test
    void mergeSort() {
        int[] arrayToSort = {20, 1, 3, 50, 4, 2};
        int[] sortedArray = {1, 2, 3, 4, 20, 50};

        MergeSort.mergeSort(arrayToSort, arrayToSort.length);
        Assertions.assertArrayEquals (arrayToSort, sortedArray);
    }

}
