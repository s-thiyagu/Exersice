package inheritance;

public class C extends B{
    public int b;
    C(){
//        super(6);
        System.out.println("Inside C");
    }
    public C(int b) {
//        super(6);
        super.a=b;
//        super.n=b;
        aa=b;
        this.b =b;
    }

    public static void main(String[] args) {
        C sc=new C(7);
        System.out.println(sc.b);
        System.out.println(sc.aa);
    }
}
