package com.company;

public class Main {

    public static void main(String[] args) {

    }

    static void drawRectangle(int x, int y, int width, int height){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                boolean isFrame = i == 0 || i == height-1 || j == 0 || j == width-1;
                System.out.print(isFrame ? "*" : " ");
            }
            System.out.println();
        }
    }
}
