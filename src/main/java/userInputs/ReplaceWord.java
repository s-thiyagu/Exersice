package userInputs;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter The sentance");
        String userInput = sc.nextLine().trim();
        System.out.println("Enter the word need to be replaced");
        String word = sc.nextLine().trim();
        System.out.println("Enter the index number where to be replaced");
        int index = sc.nextInt();
// SSt
//        for(int i=0;i<userInput.length();i++){
//            if(userInput.charAt(i) ==' '){
//                count++;
//                if(count==index-1){
//                    String part1 = userInput.substring(0, i);
//                    String part2 = userInput.substring(i);
//                    userInput=part1+" "+word+part2;
//                    System.out.println(userInput);
//                }
//            }
//        }

//Array
        String[] user = userInput.split(" ");
        String[] userr = new String[user.length+1];
        if (index <= user.length && index > 0) {
            int j = 0;
            for (int i = 0; i <= user.length; i++) {
                if (i != index-1) {
                    userr[i] = user[j++];
                } else {
                    userr[i] = word;
                }
            }
            userInput = String.join(" ", userr);
            System.out.println(userInput);
        } else if ( index <= 0) {
            System.err.println("The give number is lesser then or equal to zero");
        }
        else {
            System.err.println("The give number is greater then the length of the sentence");
        }
    }
}

