import java.util.*;

public class Si {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        double r = sc.nextDouble();
        long p = sc.nextLong();

        double si = (p * r * t )/ 100;

        System.out.printf("%.2f",si);
    }
    
}
