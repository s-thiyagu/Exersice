package staticFinal;

public class StaticMethod {
    static int a = m1();
    public int b=m2();
    static int m1() {
        System.out.println("From m1");
        return a+20;
    }
    int m2(){
        System.out.println("from m2");
        return b+100;
    }
    {
        System.out.println("Inside static block");
    }
    public static void main(String[] args) {
        System.out.println("Value of a: " + a );
        System.out.println("From main");
        StaticMethod bc=new StaticMethod();
    }
}
