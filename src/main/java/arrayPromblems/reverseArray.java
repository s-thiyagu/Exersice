package arrayPromblems;

import java.util.Arrays;
import java.util.Scanner;

public class reverseArray {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the array Elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int last=a.length-1;
        System.out.println(Arrays.toString(a));
        for(int i=0 ;i<n/2;i++){
            int temp=a[i];
            a[i]=a[last];
            a[last]=temp;
            last--;
        }
        System.out.println(Arrays.toString(a));
//        reverseArray ab= new reverseArray();
//        System.out.println(Arrays.toString(ab.plusOne(a)));

    }

        public int[] plusOne(int[] digits) {
          for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] + 1 != 10) {
                    digits[i] += 1;
                    return digits;
                }
                digits[i] = 0;
            }

            int[] newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            return newDigits;
        }

}
