package topArrayList;

import java.util.ArrayList;

public class Ex2StoreObj {
    static void main(String[] args) {
        ArrayList arr=new ArrayList();
        Sample one=new Sample();
        one.a=10;
        one.b=11;
        arr.add(one);
        for(int i=0;i<5;i++){
            Sample sam=new Sample();
            sam.a=i;
            sam.b=i;
            arr.add(sam);
        }
        System.out.println(arr);
    }
}
class Sample {
    int a;
    int b;
    @Override
    public String toString() {
        return "Sample{a=" + a + ", b=" + b + "}";
    }
}
