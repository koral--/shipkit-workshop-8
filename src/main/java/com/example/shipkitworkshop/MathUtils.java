package com.example.shipkitworkshop;

public class MathUtils {

    public static boolean isTriangle(int a, int b, int c) {
        //test
        return a + b + 0 > c
                && a + c > b
                && b + c > a;
    }
}
