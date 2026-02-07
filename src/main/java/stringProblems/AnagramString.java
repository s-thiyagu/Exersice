package stringProblems;

import java.util.Arrays;
import java.util.Scanner;


public class AnagramString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str1 = sc.nextLine().toUpperCase().trim();
        String str2 = sc.nextLine().toUpperCase().trim();
        if(str1.length() == str2.length()){
            char[] str11=str1.toCharArray();
            char[] str22=str2.toCharArray();
            Arrays.sort(str11);
            Arrays.sort(str22);
            if(Arrays.equals(str11, str22)){
                System.out.println("Anagram");
            }
            else{
                AnagramArray.notAnagram();
            }
        }
        else{
            AnagramArray.notAnagram();
        }
    }
}
