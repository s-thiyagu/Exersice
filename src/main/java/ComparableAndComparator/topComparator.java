package ComparableAndComparator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class topComparator {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> arr=new ArrayList<>();
        for(int i=0;i<10;i++){
            arr.add(sc.nextLine());
        }
        LinkedList<String> link=new LinkedList<>(arr);
        System.out.println(link);
        System.out.println(arr);
    }
}
