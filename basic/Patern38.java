import java.util.Scanner;
public class Patern38{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the value");
        int row=sc.nextInt();
        int x=1;        
        for(int i=1;i<=row;i++){

            for(int j=1;j<=i;j++){
                System.out.print(x*x+ "  ");
                x++;
            }
            System.out.println("");
        }

    }
 
}

