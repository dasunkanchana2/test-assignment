package com.dasun.tech.assignment.bubblesort;

import java.util.Arrays;

/**
 * Bubble sort utility
 */
public class BubbleSortUtility {

    /**
     * Bubble sort
     *
     * @param arr : int[] -> Input
     */
    private void buildBubSort(int arr[]){
        int length = arr.length;
        int temp =0;
        for(int i=0;i<length;i++){
            for(int j=1;j<length-i;j++){
                if(arr[j]< arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(e -> System.out.print(e));
    }
    public static void main(String[] args) {
        int arr[] ={5,1,4,2,6,3};
        BubbleSortUtility bubSortObj = new BubbleSortUtility();
        bubSortObj.buildBubSort(arr);
    }
}
