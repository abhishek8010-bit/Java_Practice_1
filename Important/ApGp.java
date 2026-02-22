import java.util.*;

public class ApGp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4];
        int AP = 0;

        for(int i=0; i<4; i++){
            arr[i] = sc.nextInt();
        }

        // for(int j=0; j<4; j++){
        //     System.out.println(arr[j]);
        // }

        Arrays.sort(arr);

        // for(int k=0; k<4; k++){
        //     System.out.println(arr[k]);
        // }
        int a = arr[0];
        int d = arr[1] - arr[0];
        
        
        for(int j=0; j<4; j++){
            AP = a + j * d;
            System.out.println(AP);
        }
        

        
        


        


    }
    
}
