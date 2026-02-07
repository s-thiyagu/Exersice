package abstraction.interfacee;

public interface Mul {
    private int fun(int a, int b) {
        return a * b;
    }

    default void mul(int a, int b) {
        System.out.println("Multiple = " + fun(a, b));
    }
}
