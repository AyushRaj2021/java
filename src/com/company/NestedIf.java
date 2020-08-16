package com.company;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b :");
        int b = sc.nextInt();
        System.out.println("Enter the value of c :");
        int c = sc.nextInt();
        int result = 0;
        result = a > b ? a > c ? a : c : b > c ? b : c;
        System.out.println("the largest of all number is " + result);
    }
}
