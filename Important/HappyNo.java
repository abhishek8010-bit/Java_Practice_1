import java.util.*;

public class HappyNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;

        while(temp > 9){
            int sum = 0;
            while (temp > 0) {
                int a = temp % 10;
                sum += a * a;
                temp /= 10;
            }
            temp = sum;
        }
        if (temp == 1) {
            System.out.println(n + " is a happy number");
        }
        else{
            System.out.println(n + " is not a happy number");
        }
    }
    
}
