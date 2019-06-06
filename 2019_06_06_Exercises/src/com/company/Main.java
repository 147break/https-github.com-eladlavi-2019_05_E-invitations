package com.company;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {34, 234, 654, 234, 654, 87, 43, 1234, 47567, 345, 765, 23454, 87, 45,23, 68, 897,6, 345, 8};
	    long t1 = System.nanoTime();
	    int sum = sumOfEven(arr);
	    long t2 = System.nanoTime();
	    long deltaT = t2 - t1;
        System.out.println(deltaT);
    }

    static int sumOfEven(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0)
                sum += arr[i];
        }

        return sum;
    }


    static void swapFirstAndLast(int[] arr){
        if(arr.length == 0)
            return;
        int temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;
    }

    static void reverseArray(int[] arr){
        int temp;
        for (int i = 0; i < arr.length/2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }

    static int countInstances(int[] arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x)
                count++;
        }

        return count;
    }

    static boolean isAscending(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i-1])
                return false;
        }
        return true;
    }

    static boolean search(int[] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == x)
                return true;
        }
        return false;
    }

    static boolean binarySearch(int[] arr, int x, int l, int r){//l is the left most index
        if(r < l)
            return false;
        int m = l+(r-l)/2;
        if(arr[m] == x)
            return true;
        if(arr[m] < x)
            return binarySearch(arr, x, m+1, r);
        return binarySearch(arr, x, l, m-1);
    }


    static boolean binarySearch(int[] arr, int x){
        int l = 0;
        int r = arr.length-1;

        while (r >= l){
            int m = l+(r-l)/2;
            if(arr[m] == x)
                return true;
            if(arr[m] < x)
                l=m+1;
            else
                r=m-1;
        }
        return false;
    }
}
