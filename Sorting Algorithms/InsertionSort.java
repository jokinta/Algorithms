package com.company;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = {64, 25, 76, 43, 13, 54, 21, 43, 21, 53, 23, 32, 12, 32, 45, 11};
        insertionSort(arr);


    }

    public static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int valueToInsert = arr[i];
            int holePos =i-1;
            while (holePos >= 0 && valueToInsert < arr[holePos]){
                arr[holePos+1]=arr[holePos];
                arr[holePos]=valueToInsert;
                holePos = holePos-1;
            }
            arr[holePos+1]=valueToInsert;



        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }
    }
}
