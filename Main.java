package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner weekday = new Scanner(System.in);
        System.out.println("Enter the keyword: ");
        int username = weekday.nextInt();

        switch (username){
            case 1:
                System.out.println("the weekday is Monday");
                break;
            case 2:
                System.out.println("the weekday is Tuesday");
                break;
            case 3:
                System.out.println("the weekday is Wednesday");
                break;
            case 4:
                System.out.println("the weekday is Thrusday");
                break;
            case 5:
                System.out.println("the weekday is Friday");
                break;
            case 6:
                System.out.println("the weekday is Saturday");
                break;
            case 7:
                System.out.println("the weekday is Sunday");
                break;
            default:
                System.out.println("Please check your input");


        }
    }
}
