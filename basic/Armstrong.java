import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value of n");
        int n=sc.nextInt();
        int sum=0;
        int a=n;
        while(n!=0){
            int rem=n%10;
            sum=sum+rem*rem*rem;
            n/=10;
        }
        if(a==sum){
            System.out.println("it is a armstrong number");
        }
        else {
            System.out.println("it is not a armstrong number");
        }
    }
}
