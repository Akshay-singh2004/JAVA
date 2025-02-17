import java.util.Scanner;
public class Neon {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int sum=0;
        int a=n*n;
        while(a!=0){
            int rem=a%10;
            sum=sum+rem;
            a/=10;
        }
        if(n==sum){
            System.out.println("it is a neon number");
        }
        else {
            System.out.println("it is not a neon number");
        }
    }
}