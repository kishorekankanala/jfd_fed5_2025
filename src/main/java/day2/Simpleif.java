package day2;

import java.util.Scanner;

public class Simpleif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value");
        int age = sc.nextInt();
        if(age < 0){
            age = -age;
        }
        System.out.println("you enter value is "+ age);
    }
}
