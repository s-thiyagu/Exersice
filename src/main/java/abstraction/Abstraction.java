package abstraction;

abstract class Abstractions {

    public abstract void fun();

    protected abstract void funnyy();

    abstract void help();
    private void hello(){

    }
    public Abstractions(){
        System.out.println("hello");
    }
}
class child extends Abstractions {

    @Override
    public void fun() {
        System.out.println("Sample abstraction for the program is fun");
    }

    @Override
    protected void funnyy() {
        System.out.println("no funny , but it is in funny ");
    }

    @Override
    void help() {
        System.out.println("help me!");
    }

}
public class Abstraction {

    public static void main(String[] args) {

        child sc = new child();

    }
}
