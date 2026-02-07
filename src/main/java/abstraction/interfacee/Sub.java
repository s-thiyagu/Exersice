package abstraction.interfacee;

public interface Sub {

    private int fun(int a, int b) {
        return a - b;
    }

    default void sub(int a, int b) {
        System.out.println("subractiom = " + fun(a, b));
    }
    default void add(int a, int b) {
        System.out.println("subractiom = " + fun(a, b));
    }
}
