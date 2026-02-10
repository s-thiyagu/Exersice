package polymorphism;

import java.util.Iterator;

class ExampleClass{
    void hi(){
        System.out.println("Iam Example Class");
    }
}
public class MethodOverriding extends ExampleClass{
    public static void main(String[] args) {

    }
    @Override
    void hi(){
        System.out.println("I have override the ExampleClass");
    }
}
