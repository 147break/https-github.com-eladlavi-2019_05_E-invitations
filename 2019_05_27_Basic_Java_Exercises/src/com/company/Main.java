package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(distance(5,8));
    }

    static int distance(int x, int y){
        int small = x;
        int large = y;
        if(x > y){
            small = y;
            large = x;
        }
        int result = 0;
        while (small + result < large)
            result++;

        return result;
    }

    static int product(int x, int y){
        int small = x;
        int large = y;
        if(x > y){
            small = y;
            large = x;
        }
        int result = 0;
        for (int i = 0; i < small; i++)
            result += large;

        return result;
    }

    static int quotient(int x, int y){
        if(y == 0)
            return -1;

        int result = 0;
        int sum = y;
        while (sum <= x){
            result++;
            sum += y;
        }

        return result;
    }

    static int remainder(int x, int y){
        if(y == 0)
            return -1;
        return distance(x, product(quotient(x,y), y));
        //return distance(7, product(quotient(7,3), 3));
    }

    static int power(int x, int y){
        if(x == 0){
            if(y == 0)
                return -1;
            return 0;
        }
        if(y == 0 || x == 1)
            return 1;

        int result = 1;
        for (int i = 0; i < y; i++)
            result *= x;



        return result;
    }

}
