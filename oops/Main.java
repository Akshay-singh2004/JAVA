package oops;

class pen{
    String color;
    String type;
    public void write() {
        System.out.println(color+"\n" + type);
        System.out.println("ready to written something");
        
    }
}
public class Main {
    public static void main(String[] args) {
        pen pen1 =new pen();
        pen1.color = "blue";
        pen1.type="ball";
        pen1.write();

    }
}
