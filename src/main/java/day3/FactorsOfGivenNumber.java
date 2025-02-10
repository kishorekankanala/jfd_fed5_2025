package day3;

import java.util.Scanner;

public class FactorsOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for factorial");
        int num = sc.nextInt();
        int res = 1;
        for(int i = 1; i<=num;i++){
            res = res*i;
        }
        System.out.println("factorial of given nume is : "+ res);
    }
}
