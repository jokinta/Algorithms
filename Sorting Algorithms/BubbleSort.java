package com.company;


public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {64, 25, 76, 43, 13, 54, 23, 25, 65, 13, 65, 21, 3, 5, 44, 33, 22, 98, 37, 36, 39, 11};
        sort(arr);

    }

    public static void sort(int arr[]) {
        boolean isSorted = false;
        int lastUnsorted = arr.length - 1;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < lastUnsorted; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;


                    isSorted = false;
                }

            }
            lastUnsorted--;


        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }


}
