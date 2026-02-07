package stringProblems;

import java.util.Scanner;

public class CountOccurrenceOfChar {
    public static void main(String[] args) {
        int[] array=new int[26];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        String Str = sc.nextLine();
        Str=Str.toLowerCase();
        int ascii=97;
        for(int j=0;j<27;j++) {
            for (int i = 0; i < Str.length(); i++) {
                if (ascii == Str.charAt(i)) {
                    array[j]++;
                }
            }
            ascii++;
        }
        char asciii=97;
        for (int i=0;i<26;i++){
            if(array[i]>0){
                System.out.println(asciii+" = "+array[i]);
                asciii++;
                continue;
            }
            asciii++;
        }
    }
}
