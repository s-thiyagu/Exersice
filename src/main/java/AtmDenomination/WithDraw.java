package AtmDenomination;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public class WithDraw {
    static void main() {

    }
    static void withDraw(int amount, User cus, LinkedHashMap<Integer,Integer> curr) {
        HashMap<Integer, Integer> user = new HashMap<>();
        int balance = cus.getBankBalance();
        int atmAmount= cus.getAtmAmount();
        cus.setAtmAmount(atmAmount-amount);
        if (atmAmount >= amount) {
            if (balance < amount) {
                try {
                    throw new InvalidInput("Insufficient Balance");
                } catch (Exception obj) {
                    obj.printStackTrace();
                }
            }
            int count = 0;
            for (Map.Entry<Integer, Integer> e : curr.entrySet()) {
                count = amount / e.getKey();
                if (count <= e.getValue()) {
                    user.put(e.getKey(), user.getOrDefault(e.getKey(), 0) + count);
                    amount = amount % e.getKey();
                    curr.put(e.getKey(), e.getValue() - count);
                } else {
                    amount = amount - (e.getValue() * e.getKey());
                    user.put(e.getKey(), user.getOrDefault(e.getKey(), 0) + e.getValue());
                    curr.put(e.getKey(), 0);
                }
            }
            System.out.println(curr);
            for(Map.Entry<Integer,Integer> e: user.entrySet()){
                if (e.getValue() > 0) {
                    System.out.println(e.getKey()+" -> "+e.getValue());
                }
            }

        }
        else{
            try{
                throw new InvalidInput("WithDraw is not successFull");
            }
            catch(Exception e){
                l[[p[]]]
                e.printStackTrace();
            }
        }
    }
}

