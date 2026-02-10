public class Armstrong {
    public static void main(String[] args) {
        int n = 153;
        int x = n;
        int sum = 0;
        while(n>0){
            int a = n % 10;
            sum += a * a * a;
            n = n / 10;   
        }
        System.out.println(sum);
        if(x == sum){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }


    }
    
}
