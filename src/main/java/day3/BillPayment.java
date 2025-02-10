package day3;

import java.util.Scanner;

public class BillPayment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter bill amount :");
        double billamount = sc.nextInt();
        double c = 1;
        double discount = 0;
        if(billamount > 9999){
            discount = billamount*0.1;
            System.out.print(" total billamount");
            System.out.println(billamount-discount);
        }

    }
}
