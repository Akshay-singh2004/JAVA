import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age");
        int age = sc.nextInt();
        System.out.println("Enter price");
        double price = sc.nextDouble();
        System.out.println(age + " " + price);
    }
}
