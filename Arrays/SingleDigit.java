package Arrays;
import java.util.*;
public class SingleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];
       // int num = 0;
        for(int j=0; j<5; j++){
            arr[j] = sc.nextInt();
        }
        for(int i=0; i<5;i++){
            System.out.print(arr[i]);
       }

    }
    
}
