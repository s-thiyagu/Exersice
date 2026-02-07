package atm;

import atm.excep.DetailsNotMatch;
import atm.Otp;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static atm.CheckDetails.check;
import static atm.CheckDetails.delay;

public class Deposit {
    static void deposit(ArrayList manage) {
        int check=check(manage);
        boolean bool= check >= 0;
        if (bool){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Amount to Deposit");
            int dep=sc.nextInt();
            if(dep < 20000 && dep>1000){
                if(Otp.otp()){
                    System.out.println("OTP Matched");
                    System.out.println("keep the amount in Atm");
                    delay();
                    CustomerDetails client= (CustomerDetails) manage.get(check);
                    int balance=client.getBalance()+dep;
                    client.setBalance(balance);
                    System.out.println("Amount Deposited Successfully");
                }
                else {
                    try {
                        throw new DetailsNotMatch("OTP does not match");
                    } catch (DetailsNotMatch object) {
                        object.printStackTrace();
                    }
                }
            }
            else if (dep < 1000) {
                try {
                    throw new DetailsNotMatch("Deposit more Than Thousand");
                } catch (DetailsNotMatch object) {
                    object.printStackTrace();
                }
            } else {
                try {
                    throw new DetailsNotMatch("Can't Deposit more than Thousand ");
                } catch (DetailsNotMatch object) {
                    object.printStackTrace();
                }
            }
        } else {
            try {
                throw new DetailsNotMatch("Details not Match to Deposit");
            } catch (DetailsNotMatch object) {
                object.printStackTrace();
            }
        }
    }
}
