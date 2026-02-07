package stringProblems;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check palindrome or not");
        String str = sc.nextLine().trim();
        String check = str;
        char[] arr = str.toCharArray();
        int last = str.length() - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[last];
            arr[last] = arr[i];
//            arr[i] = temp;
            last--;
        }
        System.out.println(arr);
        System.out.println(check);
        str = String.valueOf(arr);
        if (str.equals(check)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
}
