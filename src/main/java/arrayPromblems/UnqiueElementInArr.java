package arrayPromblems;

import java.util.Arrays;
import java.util.Scanner;

public class UnqiueElementInArr {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The number of digit in the Array");
        int n=sc.nextInt();
        int[] a=new int[n];
        int i=0;
        while(i<n){
            System.out.println("Enter the number ");
            int num=sc.nextInt();
            boolean check=true;
            for(int j=0;j<a.length;j++){
                if(num==a[j]){
                    check=false;
                }
            }
            if(check){
                a[i]=num;
                i++;
            }
            else{
                System.out.println(num+" is a duplicate");
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
