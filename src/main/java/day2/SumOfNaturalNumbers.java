package day2;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println("enter given n value");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i<=n ; i++){
            sum = sum+i;
        }
        System.out.println("sum of"+n+"number is : "+sum);


    }

}
