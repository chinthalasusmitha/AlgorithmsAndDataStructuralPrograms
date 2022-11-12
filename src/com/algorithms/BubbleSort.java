package com.algorithms;

import java.util.Arrays;


public class BubbleSort {
    public static void main(String[] args){
        int array[] ={5,10,100,16,60,20,15};
        System.out.println("After Bubble Sorting");
        sort(array);
        System.out.println(Arrays.toString(array));
    }


    public static void sort(int[] array){
        for(int i=0;i<array.length;i++){
            for (int j=1;j< array.length;j++){
                if(array[j]<array[j-1]){
                    swapping(array,i,j);
                }
            }
        }
    }
    public static void swapping(int[] array, int i, int j) {
        int temp=array[j];
        array[j]=array[j-1];
        array[j-1]=temp;
    }
}