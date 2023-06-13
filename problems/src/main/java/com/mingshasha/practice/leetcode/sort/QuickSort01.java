package com.mingshasha.practice.leetcode.sort;

import java.util.Arrays;

public class QuickSort01 {
    public static void main(String[] args) {
        int[] array = new int[]{10, 18, 7, 20, 8, 6, 3, 8, 10, 1};

        new QuickSort01().quickSort(array, array.length, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public void quickSort(int[] array, int length, int start, int end) {
        if (start == end) {
            return;
        }

        int index = partation(array, length, start, end);

        if (start < index) {
            quickSort(array, length, start, index - 1);
        }
        if (index < end) {
            quickSort(array, length, index + 1, end);
        }
    }

    private int partation(int[] array, int length, int start, int end) {
        if (null == array || 0 == length || start < 0 || end < 0) {
            throw new IllegalArgumentException("invalid parameters");
        }

        int index = start + (end - start) / 2;
        swap(array, index, end);

        int small = start - 1;
        for (index = start; index < end; index++) {
            if (array[index] < array[end]) {
                small++;
                if (small != index) {
                    swap(array, small, index);
                }
            }
        }
        small++;
        swap(array, small, end);
        return small;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
