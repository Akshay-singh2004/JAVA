import java.util.Scanner;
public class Pattern30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of row");
        int row=sc.nextInt();
        int n=row;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n);
            }
            System.out.println();
            n--;
        }
       
    }
}
