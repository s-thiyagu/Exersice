package StringStringBufferStrigBuilder;

public class ReverseString {
    public static void main(String[] args) {
        String name ="S ugayihT";
        StringBuffer nameone=new StringBuffer();
        StringBuilder builder=new StringBuilder();

        nameone.append(name).reverse();
        builder.append(name).reverse();
        String reverse = "";

        for(int i=name.length()-1;i>=0;i--){
            reverse+=name.charAt(i);
        }

        System.out.println("nameone = " + nameone);
        System.out.println("builder = " + builder);
        System.out.println("reverse = " + reverse);
    }
}
