package arrayPromblems;

import java.util.Scanner;

public class ArrayInput {
    static int[] arrayInput(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The number of digit in the Array");
        int n=sc.nextInt();
        int[] a=new int[n];
        int count=0;
        int oddCount=0;
        System.out.println("Enter the array Elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        return a;
    }
}
