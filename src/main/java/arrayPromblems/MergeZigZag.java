package arrayPromblems;

import java.util.Arrays;

public class MergeZigZag {
    static void main() {
        int[] a=ArrayInput.arrayInput();
        int[] b=ArrayInput.arrayInput();
        int n=a.length+b.length;
        int alen=0;
        int blen=0;
        int[] result=new int[n];
        for(int i=0;i<n;i++){
            if (blen>=b.length) {
                result[i]=a[alen++];
            }
            else if(alen>=a.length){
                result[i]=b[blen++];
            }
            else if(i%2==0){
                result[i]=a[alen++];
            }
            else{
                result[i]=b[blen++];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
