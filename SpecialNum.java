import java.util.*;

public class SpecialNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;
        while (num != 0) {
            int fact = 1;
            int a = num % 10;
            for (int i = 1; i <= a; i++) {
                fact = fact * i;

            }
            sum = sum + fact;
            num = num / 10;

           // System.out.println(sum);
        }
        if (temp == sum) {
            System.out.println("this is special number");
        } else {
            System.out.println("this is not special number");
        }

    }
}