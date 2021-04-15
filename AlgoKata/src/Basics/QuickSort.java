package Basics;

import Utils.Utils;

public class QuickSort {
    public static void main(String[] args) throws Exception {
        for(int t=0 ; t<100 ; t++){
            int arrSize = Utils.randInt(10, 100);
            int[] arr = new int[arrSize];
            for(int i=0 ; i<arr.length ; i++){
                arr[i] = Utils.randInt(10, 100);
            }
            arr = quickSort(arr);
            for(int i=1 ; i<arr.length ; i++){
                int prev = arr[i-1];
                int next = arr[i];
                Utils.expect(prev <= next, "wrong sort");
                Utils.printArr(arr);
            }
        }
    }

    static int[] quickSort(int[] arr){
        quickSort(arr, 0, arr.length);
        return arr;
    }

    private static void quickSort(int[] arr, int startI, int endI) {
        if(endI - startI <= 1) return;
        int divI = divide(arr, startI, endI);
        quickSort(arr, startI, divI);
        quickSort(arr, divI, endI);
    }

    private static int divide(int[] arr, int startI, int endI) {
        int chosenPos = startI;
        int chosen = arr[endI - 1];
        for(int i=startI ; i<endI-1 ; i++){
            int curr = arr[i];
            if(curr <= chosen){
                swap(arr, chosenPos, i);
                chosenPos++;
            }
        }
        swap(arr, chosenPos, endI-1);
        return chosenPos;
    }

    static void swap(int[] arr, int i1, int i2){
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }
}
