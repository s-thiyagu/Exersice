package arrayPromblems;
import java.util.Arrays;
import java.util.Scanner;

public class rotateArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count = sc.nextInt();
        int[] array={1,2,3,4,5};
        int last=array.length;
        for(int i=0;i<count;i++){
            int n=0;
            for(int j=1;j<last;j++){
                int temp=array[n];
                array[n]=array[j];
                array[j]=temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

