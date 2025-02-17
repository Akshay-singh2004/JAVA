import java.util.Scanner;
public class Reverceplus {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum=sum*10+rem+1;
            n/=10;
        }
        while(sum>0){
            int rem=sum%10;
            n=n*10+rem;
            sum/=10;
        }
        System.out.println(n);
        
    }
}
