package com.Kunal_LeetCode.Sorting;

import java.util.Arrays;

public class MergeSortUsing_Recursion {
    public static void main(String[] args) {
        int[] arr = {3,5,6,8,0,2};
        arr = mergeSort(arr);
        System.out.print("The Sorted Array is : "+ Arrays.toString(arr));
        //System.out.println(Arrays.toString(arr));

    }
    static int[] mergeSort(int[] arr){
        if (arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] leftPartOfArray = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] rightPartOfArray = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return mergedArray(leftPartOfArray,rightPartOfArray);

    }

    private static int[] mergedArray(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i< left.length && j< right.length){
            if(left[i]<right[j]){
                mix[k] = left[i];
                i++;
            }else {
                mix[k] = right[j];
                j++;
            }
            k++;
            }
        while (i< left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        while (j< right.length){
            mix[k] = right[j];
            j++;
            k++;
        }
        return mix;
    }
}
