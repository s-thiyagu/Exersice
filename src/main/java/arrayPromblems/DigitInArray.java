package arrayPromblems;

import java.util.Arrays;

public class DigitInArray {
    static void main() {
        int[] a=ArrayInput.arrayInput();
        for(int i=0;i<a.length;i++){
            int count=0;
            while(a[i]>0){
                a[i]/=10;
                count++;
            }
            a[i]=count;
        }
        System.out.println(Arrays.toString(a));
    }
}
