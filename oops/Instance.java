package oops;
class A{
    int a; 
    int b;
    void show (){
        a=50;
        b=30;
        System.out.println(a+""+b);
    }

    A(){
        a=20;
        b=40;
        System.out.println(a+" "+b);
    }
    {
        a=10;
        b=70;
        System.out.println(a+" "+b);
    }
    
}
public  class Instance {
    public static void main(String[] args) {
        A r=new A();
r.show();
    }
}
