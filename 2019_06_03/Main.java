package edu.tomerbu;

public class Main {

    public static void main(String[] args) {
	    int[] arr = {2,4,1,5};
	    System.out.println(sum(arr));
    }

    static int sum(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    static void printArray(int[] arr){
        System.out.print("{");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        if(arr.length > 0)
            System.out.print(arr[arr.length-1]);
        System.out.println("}");
    }


    static boolean containsOdd(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0)
                return true;
        }
        return false;
    }


    static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    static void printPrimeFactors(int num){
        for (int i = 2; i <= num / 2; i++) {
            if(num % i == 0){
                printPrimeFactors(num/i);
                printPrimeFactors(i);
                return;
            }
        }
        System.out.print(num + " ");
    }


}
