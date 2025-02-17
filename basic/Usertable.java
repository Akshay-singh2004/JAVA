import java.util.Scanner;
public class Usertable{
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter trhe value of n");
    int a=sc.nextInt();
    int n=1;
    int table=0;
    while(n<=10){
        table=a*n;
        System.out.println(a+ " *"+ n+ "= "+ table);
        n++;
    }
}
}