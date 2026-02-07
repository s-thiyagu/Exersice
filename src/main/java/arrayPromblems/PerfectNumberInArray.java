package arrayPromblems;

public class PerfectNumberInArray {
    static void main(String[] args) {
        int[] a =ArrayInput.arrayInput();
        for(int i=0;i<a.length;i++){
            int num=a[i];
            if(perfectNumber(num)){
                System.out.println(a[i]+" Is a perfect Number");
            }
        }
    }

    static boolean perfectNumber(int num) {
        if(num==1){
            return false;
        }
        int sum=1;
        for(int i=2;i<num;i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num) {
            return true;
        }
        else {return false;}
    }
}
