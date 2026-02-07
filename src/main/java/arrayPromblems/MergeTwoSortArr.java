package arrayPromblems;

import java.util.Arrays;

public class MergeTwoSortArr {
    static void main(String[] args) {
        int[] a=ArrayInput.arrayInput();
        int[] b=ArrayInput.arrayInput();
        Arrays.sort(a);
        Arrays.sort(b);
        int n=a.length+b.length;
        int alen=0;
        int blen=0;
        int[] finall =new int[n+1];
        for(int i=0;i<n;i++){
            if (blen>=b.length) {
                finall[i]=a[alen++];
            }
            else if(alen>=a.length){
                finall[i]=b[blen++];
            }
            else if(a[alen]<=b[blen]){
                finall[i]=a[alen];
                alen++;
            }
            else if (a[alen]>=b[blen]){
                finall[i]=b[blen];
                blen++;
            }
            System.out.println(finall[i]);
        }
    }
}
