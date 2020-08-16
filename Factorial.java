package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int fact = 1;
        for(int i = n; i >= 1; i--){
            fact = fact * i;
        }
        System.out.println("The factorial is " + fact);
    }
}
