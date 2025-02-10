package day3;

public class BreakExample {
    public static void main(String[] args) {
        int n = 10;
        for(int i =1;i<=n;i++){
            if (i%3 == 0 && i%6==0){
                break;
            }
            if (i % 3 ==0){
                continue;
            }
            else{
                System.out.println(i);
            }
        }
    }
}
