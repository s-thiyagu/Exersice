package arrayPromblems;

public class PalindromeInArray {
    static void main() {
        int[] a=ArrayInput.arrayInput();
        for(int i=0;i<a.length;i++){
            int n=String.valueOf(a[i]).length()/2;
            int check=a[i];
            int value=0;
            for(int j=0;j<String.valueOf(a[i]).length();j++){
                value=value*10+check%10;
                check/=10;
            }
            if(value==a[i]){
                System.out.println("Palindrome = "+ a[i]);
            }
            else{
                System.out.println("Not Palindrome = "+ a[i]);
            }
        }
    }
}
