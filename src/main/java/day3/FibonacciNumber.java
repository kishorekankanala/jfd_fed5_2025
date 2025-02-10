package day3;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        for(int i =0;i<=n;i++){
            int sum = a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
        }
    }
}
