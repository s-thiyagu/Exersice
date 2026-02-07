package atm;

import java.util.Random;
import java.util.Scanner;

public class Otp {
    static boolean otp() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int min = 1000;
        int max = 9999;
        int OTP = rand.nextInt((max - min) + 1) + min;
        System.out.println("Enter the Number u have recieved in the phone");
        CheckDetails.delay();
        System.out.println("OTP = " + OTP);
        int cusOtp = sc.nextInt();
        if(cusOtp==OTP){
            return true;
        }
        return false;
    }
}
