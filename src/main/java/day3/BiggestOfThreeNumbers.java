package day3;

import java.util.Scanner;

public class BiggestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 num: ");
        int num1 = sc.nextInt();
        System.out.println("enter 2 num: ");
        int num2 = sc.nextInt();
        System.out.println("enter 3 num: ");
        int num3 = sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println(num1+" num1 is bigg");
        }
        else if(num2>num3){
            System.out.println(num2 + " num2 is bigg");
        }
        else if(num2==num1&&num1==num3){
            System.out.println("all three numbers are same ");
        }
        else{
            System.out.println("num3 is bigg"+ num3);
        }


    }
}
