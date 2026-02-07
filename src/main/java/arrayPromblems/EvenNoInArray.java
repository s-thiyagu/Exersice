package arrayPromblems;

import java.util.Arrays;
import java.util.Scanner;

class EvenNoInArray {
    public static void main(String[] args) {
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
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                count++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Number of Even Number in the Array = " + count);
        System.out.println("Number of Odd Number in the Array = " + oddCount);
    }
}
