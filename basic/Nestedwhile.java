import java.util.Scanner;
public class Nestedwhile{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the starting point");
    int s=sc.nextInt();
    System.out.println("enter the value ending point");
    int e=sc.nextInt();
    while(s<=e){
        int n=1;
        int table=0;
        while(n<=10){
            table=s*n;
            System.out.println(table);
            n++;
        }
        System.out.println();
        s++;
    }
}
}