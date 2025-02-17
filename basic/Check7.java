import java.util.Scanner;
public class Check7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");;
        int n=sc.nextInt();
        System.out.println("enter the value of m");
        int m=sc.nextInt();
        int i=100;
        while(i>=1){
            if(i%n==0&&i%m==0){
                System.out.println(i);
            }
            i--;
        }

    }
}
