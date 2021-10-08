package com.company.classwork.chapter2;

public class BlockTest {
    public static void main(String[] args) {
        int x, y;
        y = 10;
        for (x = 0; x < 50; x++) {
            System.out.println("int x:" + x);
            System.out.println("int y:" + y);
            y = y - 4;
        }
    }
}
