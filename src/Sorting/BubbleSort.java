package Sorting;

import java.util.*;
public class BubbleSort {
    public static void bubbleSortSln(int arr[]) {
        for(int turn = 0; turn<arr.length-1; turn++){  // Outer loop -> n times
            for(int j=0; j<arr.length-1-turn; j++) {  //inner loop -> n-1-turns
                if(arr[j] > arr[j+1]) {                 // 0(n^2)
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {5,4,1,3,2};
        bubbleSortSln(arr);
        printArr(arr);
    }
}
