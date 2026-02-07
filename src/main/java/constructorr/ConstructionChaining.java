package constructorr;

public class ConstructionChaining {
    int id;
    String name;
    ConstructionChaining(){
        System.out.println("Default Constructor");
    }
    ConstructionChaining(int id){
        System.out.println("One parameter");
        this.id=id;
    }
    ConstructionChaining(int id,String name){
        this(id);
        this.name=name;
        System.out.println("Two parameter");
    }
    public static void main(String[] args) {

    }
}
