package arrayPromblems;

import java.util.Scanner;

public class ArrayAverage {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int avg=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
}
