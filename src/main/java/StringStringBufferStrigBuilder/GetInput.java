package StringStringBufferStrigBuilder;

import java.util.Scanner;

public class GetInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name= sc.nextLine();
        System.out.println("Enter your country");
        String country= sc.nextLine();
        StringBuilder sb=new StringBuilder(name);
        StringBuffer sd=new StringBuffer(country);
        sd.append(" Thiyagu");
        sb.append("Iam from");
        sb.append(" Tailand");
//      name+=" Raja";
        System.out.println(sd.toString());
        System.out.println();

    }
}
