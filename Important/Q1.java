public class Q1 {
    public static void main(String[] args) {
        String name = "banana";

        name = name.toLowerCase();

        int count [] = new int[26];

        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);

            if(ch>='a' && ch<='z'){
                count[ch - 'a']++ ;
            }
          }
          for(int j=0; j<count.length; j++){
                if(count[j] > 0){
                    System.out.println((char)(j + 'a') + " - " + count[j] );
                }
        }
    }
}    

