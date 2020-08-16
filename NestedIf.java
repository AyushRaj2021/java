package com.company;

public class NestedIf {
    public static void main(String[] args) {
        int a = 18,b = 126, c = 72;
        int result = 0;
        result = a > b ? a > c ? a : c : b > c ? b : c;
        System.out.println(result);
    }
}
