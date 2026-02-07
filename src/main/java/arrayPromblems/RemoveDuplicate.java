package arrayPromblems;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array Length");
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        n--;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]==arr[i]&&arr[i]!=-1){
                    arr[j]=arr[n];
                    arr[n]=-1;
                    n--;
                    j--;
                }
            }
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //delet Particular Element in Array
        System.out.println("Enter the particular index to delete the element ");
        int index=sc.nextInt();
        arr[index]=-1;
        for(int i=index;i<n;i++){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

