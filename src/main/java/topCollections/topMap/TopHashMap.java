package topCollections.topMap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class TopHashMap {
    static void main(String[] args) {
        //A HashMap is a part of Java’s Collection Framework and implements the Map interface.
        //It stores elements in key-value pairs, where, Keys are unique.
        //and Values can be duplicated.
       HashMap<Integer, String> m = new HashMap<>();

        m.put(1, "Thiyagu");
        m.put(2, "noname");
        m.put(2, "en ooru yenna theriyathu");
        m.put(4, "en per  yenna theriyathu");
        System.out.println(m);
        m.put(2, "For");
        System.out.println(m);
        m.remove(3);
        System.out.println(m);
        m.forEach( (k, v) -> { System.out.println(k + " -> " + v); } );
        for (Map.Entry<Integer, String> e : m.entrySet()) {
            System.out.println("Key: " + e.getKey()
                    + " Value: " + e.getValue());
        }
        System.out.println(isAnagram("ttt","ttt"));
    }
    public static boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> check=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            check.put(ch,check.getOrDefault(ch,0)+1);
        }
        System.out.println(check);
        return true;
    }
}
