package Basics;

import Utils.Utils;

import java.util.Arrays;
import java.util.Random;

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
            }
        }
    }

    static int[] quickSort(int[] arr){
        // insertCode
        return arr;
    }
}
