package topExceptions;

import topExceptions.excep.AgeRestriction;

class ExTryCatch {
    static void checkAge(int age) throws AgeRestriction {
        if (age < 18) {
            throw new AgeRestriction("hello yarr!");
        }
    }
    public static void main(String[] args){
        int n = 10;
        int m = 0;
        try {
            checkAge(15);
        } catch (Exception object){

        }
    }
}