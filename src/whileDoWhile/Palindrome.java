package whileDoWhile;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int temp = n;
        int reversenumber = 0;
        while( temp >0 ){
            int lastdigit = temp % 10;
            temp /= 10;
            reversenumber = reversenumber *10 + lastdigit;
        }
        if(reversenumber == n ){
            System.out.println("the number " + n + " is Palindrome ");
        }
        else{
            System.out.println("the Number " + n + " is not Palindrome");
        }
    }
}


/*
432
2*10+3= 23
23*10+4=234(reversed number)
 */