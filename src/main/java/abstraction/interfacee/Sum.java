package abstraction.interfacee;

public interface Sum {
    private int fun(int a, int b) {
        return a+b;
    }

    default void sum(int a, int b) {
        System.out.println("Addition = " + fun(a, b));
    }
}
