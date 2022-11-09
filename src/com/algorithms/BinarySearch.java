package com.algorithms;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        String arr[] = {"pinky", "rocky", "chinnii", "bunty", "chintu"};
        Scanner sc = new Scanner(System.in);
        System.out.println("{Pinky,Rocky,Chin,Bunty,Chintz} " +
                "\nchoose  a name from the above list");
        String searchString = sc.next();
        int result = binarySearch(arr, searchString);
    if (result == -1)
            System.out.println("Name not found in the list....");
        else
                System.out.println("Name found at the index " + result);
}


    static int binarySearch(String[] arr, String searchString) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // formula to find mid point
            int result = searchString.compareTo(arr[mid]);
            if (result == 0)
                return mid;
            if (result > 0)
                low = mid + 1;
            else
                high = mid - 1;

        }
        return -1;

    }
}


