package com.codecool.dynamicArrayDojo;

public class Program {

    static int[] i = new  int[10];
    public static void main(String[] args) {
        System.out.println("Do not run me, run the TESTS!");

        for (int j = 0; j<4; j++) {
            j*=2;
            System.out.println(j);
        }

        System.out.println(i.toString());
    }
}
