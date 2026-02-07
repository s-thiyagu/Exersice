package atm;

import atm.excep.Nobalance;

import java.util.ArrayList;
import java.util.Scanner;

public class HdfcAtm {
    static void main(String[] args) {
        ArrayList manage=new ArrayList();
        showOption();
        Scanner sc = new Scanner(System.in);
        {
            CustomerDetails cus = new CustomerDetails();
            System.out.println("Enter Customer Details to continue the Services");
            EnterCustomerDetails.enterCustomerDetails(cus);
            manage.add(cus);
        }
        showOption();
        System.out.println("Enter the number to choice your service");
        int choice = sc.nextInt();
        if (choice < 0 || choice > 6) {
            System.out.println("you have Entered a wrong option");
        } else {
            while (choice > 0 && choice < 8) {
                CustomerDetails cus = new CustomerDetails();
                switch (choice) {
                    case 1:
                        DisplayBalance.displayBalance(manage);
                        break;
                    case 2:
                        Deposit.deposit(manage);
                        break;
                    case 3:
//                        if(cus.getBalance()>1000) {
                            Withdraw.withdraw(manage);
//                        }
//                        else{
//                            try{
//                                throw new Nobalance();
//                            } catch (Exception e) {
//                                e.printStackTrace();
//                            }
//                        }
                        break;
                    case 4:
                        DisplayCustomerDetail.display(manage);
                        break;
                    case 5:
                        EnterCustomerDetails.enterCustomerDetails(cus);
                        manage.add(cus);
                        break;
                    case 6:
                        System.out.println("Thanks for using our bank ");
                        choice = 9;
                        break;
                    case 7:
                        System.out.println(manage);
                        break;
                }
                if (choice > 0 && choice < 8) {
                    CheckDetails.delay();
                    System.out.println();
                    showOption();
                    choice = sc.nextInt();
                }
            }
        }
    }
    static void showOption() {
        System.out.println("=====================Welcome to HDFC =============================");
        System.out.println();
        System.out.println("                          HDFC ATM                                 ");
        System.out.println();
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit");
        System.out.println("3.WithDraw");
        System.out.println("4.Display Customer Details");
        System.out.println("5.Enter Customer Details");
        System.out.println("6.To Exit");
        System.out.println();
    }
}


