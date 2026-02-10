package topCollections.topList.topArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex1ArrayList {
    static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("Thiyagu");
        arr.add("vijay");
        arr.add("selva Kumar");
        System.out.println(arr.get(1));
        System.out.println(arr.indexOf("vijay"));
        arr.clear();
        System.out.println(arr);
        ArrayList arr1=new ArrayList();
        arr1.add("hi");
        arr1.add(12);
        System.out.println(arr1);
        arr1.add("c");
        System.out.println(arr1);
        Iterator<String> it = arr1.iterator();
    }
}
