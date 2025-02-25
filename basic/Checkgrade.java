import java.util.Scanner;
public class Checkgrade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the marks of students");
        int mrk=sc.nextInt();
        if(mrk==25){
            System.out.println("fail");
        }
        else if(mrk>25&&mrk<=45){
            System.out.println("grade is e");
        }
        else if(mrk>45&&mrk<=50){
System.out.println("grade is d");
        }
        else if(mrk>50&&mrk<=60){
            System.out.println("grade is c");
                    }
                    else if(mrk>60&&mrk<=80){
                        System.out.println("grade is b");
                                }
                else if(mrk>80){
                            System.out.println("grade is a");
            }
    }
}
