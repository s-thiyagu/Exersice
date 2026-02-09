package topCollections.topMap;

import java.util.HashMap;
import java.util.Map;

class TopHashMap {
    static void main(String[] args) {
        //A HashMap is a part of Java’s Collection Framework and implements the Map interface.
        //It stores elements in key-value pairs, where, Keys are unique.
        //and Values can be duplicated.
        HashMap<Integer, String> m = new HashMap<>();
        m.put(1, "Thiyagu");
        m.put(2, "noname");
        m.put(3, "en ooru yenna theriyathu");
        m.put(4, "en per  yenna theriyathu");
        System.out.println(m);
        m.put(2, "For");
        System.out.println(m);
        m.remove(3);
        System.out.println(m);
        for (Map.Entry<Integer, String> e : m.entrySet()) {
            System.out.println("Key: " + e.getKey()
                    + " Value: " + m.entrySet());
        }
    }
}
