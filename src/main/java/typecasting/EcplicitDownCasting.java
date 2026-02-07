package typecasting;
class animal{
    void fun(){
        System.out.println("Iam Animal");
    }
}
class dog extends animal {
    void funny(){
        System.out.println("Iam Dog");
    }
}
public class EcplicitDownCasting {
    public static void main(String[] args) {
        //upcasting
        animal ref=new dog();
        ref.fun();
        //dog.funny();// so its making error;
        //down casting
        dog dogs=(dog) ref;
        dogs.funny();
        dogs.fun();
    }
}
