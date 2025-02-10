package day4;

public class MethodExample {
    public static void main(String[] args) {
        int lb = 1, ub = 10;
        System.out.println(evenSum(lb, ub));
        System.out.println("sum of even numbers");

    }

    public static int evenSum(int lb, int ub) {
        int sum = 0;
        for (int i = lb; i <= ub; i++) {
            if (isEven(i)) {
                sum = sum + i;
            }
        }
        return sum;
    }
    public static boolean isEven(int num){
        return num%2==0;
    }
}

