package constructorr;

public class constructorExample {
    private  int a;
    public int empId;
    public String name;
  //  final int a;

    protected constructorExample(int empId, int a) {
        this.empId = empId;
        this.a = a;
    }
    //  Default Constructor
    public constructorExample() {
        System.out.println("Default constructor");
    }

    //Parameterized Constructor
    public constructorExample(int num) {
        System.out.println("running b");
        empId = num;
    }

    public constructorExample(String name) {
        this.name = name;
    }

    public constructorExample(String name, int empId) {
        System.out.println("running c");
        this.name = name;
        this.empId = empId;
    }

    // Copy Constructor
    public constructorExample(constructorExample obj1) {
        this.name = obj1.name;
        this.empId = obj1.empId;
    }

    //Private Constructor
    private constructorExample(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "constructorExample{" +
                "a=" + a +
                ", empId=" + empId +
                ", name='" + name + '\'' +
                '}';
    }
//Print object

    public static void main(String[] args) {
        constructorExample a = new constructorExample();
        constructorExample b = new constructorExample(1);
        constructorExample c = new constructorExample("Thiyagu", 2);
        constructorExample d = new constructorExample(c);
        constructorExample e= new constructorExample("Hello");
        constructorExample f= new constructorExample(1,2);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
}
