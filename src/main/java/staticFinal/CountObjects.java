package staticFinal;

public class CountObjects {
    static int count=0;
    {
        count++;
    }
    void fun(){
        System.out.println("fun");
    }

    public static void main(String[] args) {
        CountObjects oc=new CountObjects();
        CountObjects od=new CountObjects();
        CountObjects oe=new CountObjects();
        CountObjects of=new CountObjects();
        System.out.println("count = " + count);
    }
}
