package objects;

public class ObjectClass {
    static void main(String[] args) {
        String a="'Thiyagu";
        System.out.println(a.getClass());
        System.out.println(a.hashCode());

        int[] b= new int[1000];
        String[] c= new String[0];
        System.out.println(b.hashCode());
        System.out.println(b.getClass());
        System.out.println(c.getClass());


    }


}
