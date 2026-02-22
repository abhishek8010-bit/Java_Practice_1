import java.util.*;
public class MoneyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[8];

        for(int i=0; i<8; i++){
            arr[i] = sc.nextInt();
        }

        int r1 = arr[0] * 1;
        int r2 = arr[1] * 2;
        int r3 = arr[2] * 5;
        int r4 = arr[3] * 10;
        int r5 = arr[4] * 20;
        int r6 = arr[5] * 50;
        int r7 = arr[6] * 100;
        int r8 = arr[7] * 1000;

        int coins = r1 + r2 + r3;
        int notes = r4 + r5 + r6 + r7  + r8;

        int total = coins + notes;

        System.out.println("Rs. "+ coins + " is a coins Rs. "+ notes + " is a notes Rs. " + total+".");
    }
    
}
