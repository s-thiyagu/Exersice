package polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        int a=10;
        int b=10;
        sum();
        sum(a,b);
    }
    static void sum(int a, int b) {
    }
    static void sum() {
        System.out.println("sum");
    }
}
