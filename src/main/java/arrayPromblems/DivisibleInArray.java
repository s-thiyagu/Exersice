package arrayPromblems;

public class DivisibleInArray {
    static int a=10;
    static void main() {
        int[] a=ArrayInput.arrayInput();
        int count3=0;
        int count4=0;
        int count5=0;


        for(int i=0;i<a.length;i++){
            if(a[i]%3==0){
                System.out.println(("Divisible by 3 = ")+a[i]);
                count3++;
            }

            if(a[i]%4==0){
                System.out.println("Divisble by 4 = "+a[i]);
                count4++;
            }

            if(a[i]%5==0){
                System.out.println(("Divisible by 5 = ")+a[i]);
                count5++;
            }
        }
        System.out.println("Number of elements that are divisible ny 3 in array = "+count3);
        System.out.println("Number of elements that are divisible ny 3 in array = "+count4);
        System.out.println("Number of elements that are divisible ny 3 in array = "+count5);
    }
}
