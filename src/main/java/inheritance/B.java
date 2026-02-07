package inheritance;

public class B extends A {
    int a;
    private int n;
    B(){
        System.out.println("Inside B");
    }
    B(int a) {
        this.a = a;
        System.out.println("Inside B");
    }
    public static void main(String[] args) {

    }
}
