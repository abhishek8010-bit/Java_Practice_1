import java.util.Scanner;

public class SwapCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char arr[] = n.toCharArray();

        for(int i=0; i<n.length();i++){
            if(arr[i]>='a' && arr[i]<='z'){
                arr[i] =(char) (arr[i] - 32);
            }
            else if(arr[i] >= 'A' && arr[i] <= 'Z'){
                arr[i] =(char) (arr[i] + 32);
            }
        }
        System.out.println(new String(arr));
    }
    
}
