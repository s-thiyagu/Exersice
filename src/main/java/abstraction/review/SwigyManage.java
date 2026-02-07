package abstraction.review;

import java.util.ArrayList;
import java.util.Scanner;

class SwigyManage extends Swigy {
    String CusName;
    int cusId;
    public void order(String cusName, int cusId) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Menu");
        System.out.println(" 1.Biryani Rs.90");
        System.out.println(" 2.Fried Rice Rs.80");
        System.out.println(" 3.Chicken Rs.70");
        System.out.println(" 4.exit");
        int count = 1;
        int friedRice = 0;
        int biryani = 0;
        int chicken = 0;
        while (count > 0) {
            System.out.println(" Enter the Dish You Want , Enter the Number");
            int chioce = sc.nextInt();
            switch (chioce) {
                case 1:
                    System.out.println("How many biryani do you want");
                    biryani+= sc.nextInt();
                    break;
                case 2:
                    System.out.println("How many Fried Rice do you want");
                    friedRice+=sc.nextInt();
                    break;
                case 3:
                    System.out.println("How many Chicken do you want");
                    chicken+=sc.nextInt();
                case 4:
                    count=-1;
                    break;
            }
        }
        System.out.println(" You have Order \n Biryani = " + biryani + "\n Fried Rice = " + friedRice + "\n chicken = " + chicken);
        System.out.println(" Your Order is ready");
        int bill = biryani * 90 + friedRice * 80 + chicken * 70;
        System.out.println(" The Total bill is = " + bill);
    }
}
class Customer{
    static void main() {
        Scanner sc=new Scanner(System.in);
        ArrayList<Object> a=new ArrayList<>();
        boolean cuscheck=true;
        while(cuscheck){
            SwigyManage cus=new SwigyManage();
            System.out.println("Enter the Customer Name ");

            cus.CusName=sc.nextLine();

            System.out.println("Do you like to continue then type yes");
            if(sc.nextLine().equals("yes")){
                cuscheck=true;
            }
            else{
                cuscheck=false;
            }

        }
        SwigyManage cus1=new SwigyManage();
        System.out.println("Enter Customer Name");
        String cusName=sc.nextLine();
        System.out.println("Enter Customer Id");
        int cusId=sc.nextInt();
        cus1.order(cusName,cusId);
    }
}