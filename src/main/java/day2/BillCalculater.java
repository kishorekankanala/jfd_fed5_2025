package day2;

import java.util.Scanner;

public class BillCalculater {
    public static void main(String[] args) {
        System.out.println("enter your price");
        Scanner sc = new Scanner(System.in);
        double billAmunt = sc.nextDouble();
        double discount = 0;
        if(billAmunt>= 10000){
            discount = billAmunt*0.1;
        }
        double netAmount = billAmunt-discount;
        System.out.println("dillAmount"+ billAmunt);
        System.out.println("discount" + discount);
        System.out.println("net amount "+ netAmount);

    }
}
