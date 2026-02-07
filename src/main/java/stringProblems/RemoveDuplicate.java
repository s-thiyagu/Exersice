package stringProblems;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println("Enter the String to remove the duplicate");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    str = str.substring(0, j) + str.substring(j + 1);
                    j--;
                }
            }
        }
        System.out.println("removed duplicate : " + str);
    }
}
