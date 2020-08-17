package whileDoWhile;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while(temp>0){
            int lastDigit = temp % 10;
            temp /= 10;
            sum += lastDigit;
        }
        System.out.println("The Sum Of digits of " + n + " is "+ sum);
    }
}


/*
453 % 10 = 3
453/10 = 45  45%10 = 5
45/10 = 4    4%10 = 4
so, this way we can get the numbers

  ***for finding    no of digits=     (int)Math.log10(n)+1
 */
