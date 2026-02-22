public class Palindrome {
    public static void main(String[] args) {
        int n =121;
        int a = n;
        int temp;
        int rev =0;
        while(n>0){
            temp = n%10;
            rev = rev * 10 + temp;
            n = n / 10;
        }
        if(rev == a){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    
}
