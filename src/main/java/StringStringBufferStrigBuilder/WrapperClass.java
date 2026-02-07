package StringStringBufferStrigBuilder;

public class WrapperClass {
    public static void main(String[] args)  {

        int a=10;
        Integer objA=a;
        int y=11;
        char b='t';
        Character objB=b;

        float c= 10.36F;
        Float objC=Float.valueOf(c);

        //autoBoxing
        char bb=Character.valueOf(objB);
        int aa=Integer.valueOf(objA);
        int aaa=objA;

        System.out.println("aa = " + aa);
        System.out.println("bb = " + bb);
        System.out.println("aaa = " + aaa);

        System.out.println(objA==y);
        System.out.println(objA.equals(y));
    }
}
