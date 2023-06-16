package com.gzl0ng.sort;

import org.junit.jupiter.api.Test;

/**
 * @author:郭正龙
 * @data:2023/6/14
 */
public class SwapSort {
    @Test
    public void bubbleSortO() {

        int a[] = {1, 2, 5, 4, 3};

        int temp = 0;

        for (int i = 0; i < a.length - 1; i++) {

            for (int j = 0; j < a.length - 1 - i; j++) {

                if (a[i] > a[j + 1]) {

                    temp = a[i];

                    a[i] = a[j + 1];

                    a[j + 1] = temp;

                }

            }

        }

        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);

        }

    }

    @Test
    public void quicklySort() {

        int a[] = {1, 2, 5, 4, 3};
        int strat = 0;
        int end = a.length -1;

        int[] qsort = qsort(a, strat, end);
        for (int i = 0; i < qsort.length; i++) {
            System.out.println(qsort[i]);
        }
    }

    public static int[] qsort(int arr[],int start,int end){
        int pivot = arr[start];
        int i = start;
        int j = end;
        while (i < j) {
            while ((i < j) && (arr[j] > pivot)) {
                j--;
            }
            while ((i < j) && (arr[i] < pivot)) {
                i++;
            }
            if ((arr[i] == arr[j]) && (i < j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i - 1 > start) arr = qsort(arr, start, i - 1);
        if (j + 1 < end) arr = qsort(arr, j + 1, end);
        return arr;
    }

}
