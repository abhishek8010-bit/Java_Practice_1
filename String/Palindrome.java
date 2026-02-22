import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        
        String rev = "";

        for(int i=n.length()-1; i>=0; i--){
            rev += Character.toString(n.charAt(i));
        }
        System.out.println(rev);

        if(rev.equals(n)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not");
        }
    }
    
}
