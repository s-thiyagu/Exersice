package typecasting;

public class WidingAndNarrowing {
    public static void main(String[] args) {
        //widening,implicit casting,upcasting
        byte small =127;
        int large= small;
        long larger= small;
        float largest= small;

        // narrowing,explicit casting ,
        double highest=2147483648.0;
        double highest1= 922337203685477532432.0;
        long higher=(long)highest1;
        int high=(int)highest;
        byte low=(byte)highest;
        System.out.println("low = " + low);
        System.out.println("high = " + high);
        System.out.println("higher = " + higher);
        System.out.println("highest = " + highest);
        System.out.println("largest = " + largest);
        System.out.println("larger = " + larger);
        System.out.println("large = " + large);
        System.out.println("small = " + small);
    }
}
