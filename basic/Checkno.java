import java.util.Scanner;
public class Checkno {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n");
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("number is even ");
        }
        else {
            System.out.println("number is odd");
        }
    }
}
