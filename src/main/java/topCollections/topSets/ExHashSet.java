package topCollections.topSets;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class ExHashSet {
    static void main() {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Character> a = new LinkedHashSet<>();
        String str = sc.nextLine();
        char[] strArr = str.toCharArray();
        for (int i = 0; i < strArr.length; i++) {
            a.add(strArr[i]);
        }
        System.out.println(a.size());
        str="";
        for (char i : a) {
            str=str+i;
        }
        System.out.println(str);
    }
}
