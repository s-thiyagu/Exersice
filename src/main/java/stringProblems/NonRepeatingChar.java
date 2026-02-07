package stringProblems;

import java.util.Scanner;

public class NonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
           int count=search(str,i);
           if(count==0){
               System.out.println("First non-repeating character = "+str.charAt(i));
               i=str.length();
           }
        }
    }

    static int search(String str,int i) {
        int count=0;
        for(int j=i+1;j<str.length();j++) {
            if (str.charAt(i) == str.charAt(j)) {
                count++;
            }
        }
        return count;
    }
}
