import java.util.Scanner;
public class Table2{
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter trhe value of n");
    int a=sc.nextInt();
    int n=10;
    int table=0;
    while(n>=1){
        table=a*n;
        System.out.println(a+ " *"+ n+ "= "+ table);
        n--;
    }
}
}