import java.util.Scanner;
public class Checkpower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the power of x");
        int power=sc.nextInt();
        int x=2;
        if(power==2){
            x=x*x;
        }
        else if(power==3){
            x=x*x*x;
        }
    }
}
