package com.company;

public class SelectSort_test {
    public static void main(String[] args) {
        int arr[] = {64, 25, 76, 43, 13, 54, 21, 43, 21, 53, 23, 32, 12, 32, 45, 11};
        sort(arr);


    }

    public static void sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_idx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;

                    int temp = arr[min_idx];
                    arr[min_idx] = arr[i];
                    arr[i] = temp;


                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
