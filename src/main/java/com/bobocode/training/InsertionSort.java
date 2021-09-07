package com.bobocode.training;

public class InsertionSort {

    private InsertionSort(){}

    public static void sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int pointer = arr[i];
            int j = i - 1;

            while (j >= 0 && pointer < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = pointer;
        }
    }

}
