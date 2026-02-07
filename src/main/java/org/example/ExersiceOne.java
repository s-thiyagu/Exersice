package org.example;

public class ExersiceOne {
    public static void main(String[] args) {
        String[] cars={"volvo","Hyundai","honda","Mahindra"};
        System.out.println(cars.length);
        for (String c : cars) {
            System.out.println(c);
        }
        //Sum
        int[] numbers={6,5,4,4,7,5,3,2,6};
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        System.out.println(sum);
        //Lowest
        int lowest=numbers[0];
        for(int num:numbers){
            lowest=num<lowest?num:lowest;
            System.out.println(lowest +" num= "+num+" lowest= "+lowest);
        }
        System.out.println(lowest);


        //multi dimensional array
        int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
        System.out.println(myNumbers[1][2]);
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);

        int[][] myNumber = { {1, 4, 2}, {3, 6, 8, 5, 2} };

        System.out.println("Rows: " + myNumber.length);
        System.out.println("Cols in row 0: " + myNumber[0].length);
        System.out.println("Cols in row 1: " + myNumber[1].length);
        hello();
        sum(numbers);
    }
    static void hello(){
        System.out.println("hello world");
    }
    static void sum(int[] numbers){
        int sum=0;
        for(int num:numbers){
            sum+=num;
        }
        System.out.println("fun sum =" +sum);
    }
}