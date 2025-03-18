package oops;

class Pen{
    String color;
    String type;
    public void write() {
       
        System.out.println("ready to written something");
        
    }
    public void info(){
        System.out.println(color);
        System.out.println(type);
    }
}
public class Main2 {
    public static void main(String[] args) {
        Pen pen1 =new Pen();
        pen1.color = "blue";
        pen1.type="ball";
        pen1.info();
        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type ="gel";
        pen2.info();
        


    }
}
