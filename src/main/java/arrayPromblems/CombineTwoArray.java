package arrayPromblems;

import java.util.Arrays;
import java.util.Scanner;

public class CombineTwoArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array one");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the array Elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the Size of the array two");
        int size = sc.nextInt();
        int[] b = new int[size];
        System.out.println("Enter the array Elements");
        for (int i = 0; i < size; i++) {
            b[i] = sc.nextInt();
        }
        int total = n + size;
        int[] c = new int[total];

        for (int i = 0; i < total; i++) {
            if (i < n) {
                c[i] = a[i];
            } else {
                c[i] = b[i - n];
            }
        }
        System.out.println(Arrays.toString(c));
    }
}
