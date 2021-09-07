package com.bobocode.training;

public class MergeSort {
    private MergeSort(){}

    public static void mergeSort(int[] arr, int length) {
        if (length < 2) {
            return;
        }
        int mid = length / 2;
        int[] left = new int[mid];
        int[] right = new int[length - mid];

        System.arraycopy(arr, 0, left, 0, mid);
        if (length - mid >= 0) System.arraycopy(arr, mid, right, 0, length - mid);
        mergeSort(left, mid);
        mergeSort(right, length - mid);
        merge(arr, left, right, mid, length - mid);
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            } else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

}
