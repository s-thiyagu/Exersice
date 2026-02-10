package AtmDenomination;

import atm.excep.Nobalance;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class User {
    private int BankBalance=200000;
    private int atmAmount = 28000;

    public int getAtmAmount() {
        return atmAmount;
    }

    public void setAtmAmount(int atmAmount) {
        this.atmAmount = atmAmount;
    }

    public int getBankBalance() {
        return BankBalance;
    }

    public void setBankBalance(int bankBalance) {
        BankBalance = bankBalance;
    }
    static void main(String[] args) {

        LinkedHashMap<Integer, Integer> curr = new LinkedHashMap<>();
        curr.put(2000, 10);
        curr.put(500, 10);
        curr.put(200, 10);
        curr.put(100, 10);

        User cus=new User();
        Scanner sc=new Scanner(System.in);
        int count =0;
        int amount=0;
        while(count==0){
            System.out.println("Enter the Amount to withdraw ");
            amount=sc.nextInt();
            if(amount<=0||amount%100!=0){
                try{
                    if(amount%100!=0){
                        throw new InvalidInput("Enter Amount is not multiple of 100");
                    }
                    else {
                        throw new InvalidInput("Invalid Input");
                    }
                }
                catch (Exception obj){
                    obj.printStackTrace();
                }
            }else {
                WithDraw.withDraw(amount, cus,curr);
            }
            System.out.println("IF You want to Exit type 1 IF not then 0");
            if(sc.nextInt()==1){
                count=1;
            }
        }
    }
}
