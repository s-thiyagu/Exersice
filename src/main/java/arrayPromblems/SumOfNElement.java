package arrayPromblems;

import java.lang.reflect.Array;
import java.util.Scanner;

public class SumOfNElement {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
