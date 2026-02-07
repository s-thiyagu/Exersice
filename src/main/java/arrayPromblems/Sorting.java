package arrayPromblems;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr={4,3,1,2};
        for(int i=0;i<arr.length;i++){
            int n=0;
            for(int j=1;j<arr.length-i;j++){
                if(arr[n]>arr[j]){
                    int temp=arr[n];
                    arr[n]=arr[j];
                    arr[j]=temp;
                }
                n++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
