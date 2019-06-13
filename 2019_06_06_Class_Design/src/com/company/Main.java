package com.company;


import shapes.Circle;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOfDigits2(123));


    }

    static int largestDigit(int num){
        int max = 0;

        while (num != 0){
            int lastDigit = num % 10;


            if(lastDigit > max)
                max = lastDigit;

            num /= 10;
        }

        return max;
    }

    static int sumOfDigits(int num){
        int sum = 0;

        while (num != 0){
            int lastDigit = num % 10;


            sum += lastDigit;

            num /= 10;
        }

        return sum;
    }

    static int reverseDigits(int num){
        int result = 0;

        while (num != 0){
            int lastDigit = num % 10;


            result = result * 10 + lastDigit;

            num /= 10;
        }

        return result;
    }

    static int finiteSumOfDigits(int num){
        if(num < 10)
            return num;
        int sumOfDigits = sumOfDigits(num);
        return finiteSumOfDigits(sumOfDigits);

    }



    static int sumOfDigits2(int num){
        if(num < 10)
            return num;

        return sumOfDigits2(num/10) + num%10;
    }



    static int largestDigit2(int num){
        if(num<10)
            return num;
        int lastDigit = num % 10;
        int temp = largestDigit2(num/10);
        if(lastDigit > temp)
            return lastDigit;
        return temp;
    }



}
