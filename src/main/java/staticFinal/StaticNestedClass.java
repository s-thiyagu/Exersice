package staticFinal;

public class StaticNestedClass {
    static class Inner{

        void show(){

            System.out.println(
                    "Static Nested Class Method");
        }
    }

    public static void main(String[] args)
    {
        StaticNestedClass.Inner obj = new StaticNestedClass.Inner();
        obj.show();
    }
}
