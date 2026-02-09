package topCollections.topList.topLinkedList;

import java.util.LinkedList;

public class BaiscOperations {
    static void main(String[] args) {
        LinkedList<String> names=new LinkedList<>();
        LinkedList<String> schName=new LinkedList<>();
        //add
        schName.add("Thiyagu");
        schName.add("Vijay");
        schName.add("mareeswaran");
        names.add("Selva Kumar");
        names.add("Shalini");
        names.add("Deepak");
        names.add(2,"fine");
        names.set(2,"hello world");
        //addAll0
        schName.addAll(names);
        schName.addAll(1,names);

        System.out.println(schName);
        //get
        System.out.println(schName.getClass());
        System.out.println(schName.get(1));
        System.out.println(schName.getFirst());
        System.out.println(schName.getLast());
        //link

    }
}
