package stringProblems;

import java.util.Scanner;

public class AnagramArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str1 = sc.nextLine().toUpperCase();
        String str2 = sc.nextLine().toUpperCase();
        int[] out1 = new int[26];
        int[] out2 = new int[26];
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                char ascii = 65;
                for (int j=0;j<26;j++) {
                    if (str1.charAt(i) == ascii) {
                        out1[j]++;
                    }
                    if (str2.charAt(i) == ascii) {
                        out2[j]++;
                    }
                    ascii++;
                }
            }
            int count=0;
            for(int i=0;i<26;i++){
                if(out1[i] == out2[i] && out1[i]!=0){
               count=count+out1[i];
               }
            }
            if(count==str1.length()){
                System.out.println("Enter String is Anagram");
            }
            else{
                System.out.println("count = " + count+str1.length());
                notAnagram();
            }
        }
        else{
            notAnagram();
        }
    }

    static void notAnagram(){System.out.println("Enter String is not a Anagram");}

}
