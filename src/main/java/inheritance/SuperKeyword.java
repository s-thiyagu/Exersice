package inheritance;

class Parent {
    int id=1;
}
class Child extends Parent {
    int id=2;
    void SuperId(){
        System.out.println("super.id = " + super.id);
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        Child sc = new Child();
        sc.SuperId();
    }
}