import java.util.*;
public class Bracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.nextLine();

        int open = 0;
        int close = 0;
        int sum = 0;

        if(t == "{"){
            open ++ ;
        }
        else if(open > 0){
            open --;
        }
        else{
            close ++;
        }
        sum = (open + 1)/2 + (close + 1)/2;

        System.out.println(sum);

    }
    
}
