//monday 19-01-26 Started the exe programs 

package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;
class Exersice{
    public static void evenNumCount(){
        System.out.println("Even Number Count");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number to get the Even Digit Count");
        int num =sc.nextInt();
        int even=0;
        int count=0;
        while(num>0){
            even=num%10;
            num=num/10;
            if(even%2==0){
                System.out.println(even);
                count++;
            }
        }
        System.out.println("Even Digit Count = "+count);
    }
    public static void digitalSum(){
        System.out.println("digital Sum");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number to get the digital sum");
        int num =sc.nextInt();
        if(num==0){
            System.out.println("Digital Sum = 0");
        }
        else if(num%9==0){
            System.out.println("Digital Sum = 9");
        }
        else {
            System.out.println("Digital Sum = "+ num % 9);
        }
    }
    public static void CountDigit(){
        System.out.println("Count the Digit");
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number to get the count");
        int num =sc.nextInt();
        int count=0;
        while(num>0){
            num=num/10;
            count++;
        }
        System.out.println(count);
    }
    public static void main(String args[]){
        CountDigit();
        digitalSum();
        // break 12.00
        evenNumCount();
    }
}



