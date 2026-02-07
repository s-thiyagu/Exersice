package atm;

import atm.excep.Nobalance;
import atm.excep.DetailsNotMatch;

import java.util.ArrayList;
import java.util.Scanner;

import static atm.CheckDetails.check;
import static atm.CheckDetails.delay;

public class Withdraw {
    static void withdraw(ArrayList manage) {
        int check=check(manage);
        boolean bool= check >= 0;
        if (bool){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Amount to Withdraw");
            int withdraw = sc.nextInt();
            CustomerDetails client= (CustomerDetails) manage.get(check);
            if (withdraw <= client.getBalance()) {
                if (withdraw < 20000 && withdraw > 100) {
                    delay();
                    if (Otp.otp()) {
                        System.out.println("OTP Matched");
                        int balance = client.getBalance() - withdraw;
                        client.setBalance(balance);
                        System.out.println("Amount Withdraw Successful");

                    } else {
                        try {
                            throw new DetailsNotMatch("OTP does not match");
                        } catch (DetailsNotMatch object) {
                            object.printStackTrace();
                        }
                    }
                } else if (withdraw < 100) {
                    System.out.println("Enter amount more than hundred ");
                } else {
                    System.out.println("enter amount  less than Twenty thousand ");
                }
            } else {
                try {
                    throw new Nobalance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            try {
                throw new DetailsNotMatch("Details not Match to Withdraw");
            } catch (DetailsNotMatch object) {
                object.printStackTrace();
            }
        }
    }
}

