package day4;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiseGame {
    public static void main(String[] args) {
        int generateNum = ThreadLocalRandom.current().nextInt(1,7);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter guess num");
        int guessedNum = sc.nextInt();
        if(generateNum == guessedNum){
            System.out.println("you guesses number");
        }else{
            System.out.println("sorry! its wrong number " + generateNum);
        }
    }
}
