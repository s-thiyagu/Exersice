package stringProblems;
import java.util.Scanner;

public class ReverseStringByWords {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int last = arr.length - 1;
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, last);
            last--;
        }

        str= String.join(" ",arr );
        System.out.println(str);

    }

    static void swap(String[] arr, int i, int last) {
        String temp = arr[last];
        arr[last] = arr[i];
        arr[i] = temp;
    }
}
