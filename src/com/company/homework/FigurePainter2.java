package com.company.homework;

public class FigurePainter2 {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            for (int j = 1; j <=(3-i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println();
        for (int i = 4; i >=0; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = 0; i <=4; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
