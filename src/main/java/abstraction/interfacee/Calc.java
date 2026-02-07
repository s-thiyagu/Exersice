package abstraction.interfacee;

public class Calc implements Sum,Sub,Mul{
    public void sum(int a, int b) {
        System.out.println("addition :" + (a+b));
    }
    static void main() {

    }
}


