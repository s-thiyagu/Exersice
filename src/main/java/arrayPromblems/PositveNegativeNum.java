package arrayPromblems;

import java.util.Arrays;
import java.util.Scanner;

public class PositveNegativeNum {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The number of digit in the Array");
        int n=sc.nextInt();
        int[] a=new int[n];
        int posCount =0;
        int negCount=0;
        System.out.println("Enter the array Elements");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]>=0){
                posCount++;
            }
            else{
                negCount++;
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println("Number of positive Number in the Array = " + posCount);
        System.out.println("Number of negative Number in the Array = " + negCount);
    }
}
