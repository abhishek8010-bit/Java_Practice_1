import java.util.*;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int x = n;
        int a = n / 100;
        int b = n/10 %10;
        int c = n % 10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        if (x < 100 || x > 1000) {
            System.out.println("Invaild Input");
        } else if (a + c == b) {
            System.out.println("Lucky Number");
        } else {
            System.out.println("Not Lucky Number");
        }
    }
}