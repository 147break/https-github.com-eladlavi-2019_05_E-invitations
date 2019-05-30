package com.company;

public class Main {

    public static void main(String[] args) {
        drawRectangle(4, 3, 12, 7);
    }

    static void drawRectangle(int x, int y, int width, int height){
        for (int i = 0; i < y; i++) {
            System.out.println();
        }
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < width; j++) {
                boolean isFrame = i == 0 || i == height-1 || j == 0 || j == width-1;
                System.out.print(isFrame ? "*" : " ");
            }
            System.out.println();
        }
    }

    static void drawX(int size){

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                boolean isFrame = i == 0 || i == size-1 || j == 0 || j == size-1;
                System.out.print(isFrame ? "*" : " ");
            }
            System.out.println();
        }
    }
}
