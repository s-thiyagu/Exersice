package stringProblems;

import java.util.Stack;

public class ValidateParentheses {
    static int a;
    int b;
    public static void main() {
        String parentheses="[{()}]";
        if(isValid(parentheses)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
    public static boolean isValid(String s) {
        Stack<Character> a = new Stack<>();
        Stack<Character> b = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            a.push(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            char para=a.pop();
            if (para == '{') {
                if(b.peek()=='}'){
                    b.pop();
                }
                else{
                    return false;
                }
            } else if (para == '[') {
                if(b.peek()==']'){
                    b.pop();
                }
                else{
                    return false;
                }
            } else if (para =='(') {
                if(b.peek()==')'){
                    b.pop();
                }
                else{
                    return false;
                }
            }
            else{
                 b.push(para);
            }
        }
        return true;
    }

//    public boolean isValid(String s) {
//        Stack<Character> st=new Stack<Character>();
//        for(char c:s.toCharArray()){
//            if(c=='(') st.push(')');
//            else if(c=='{') st.push('}');
//            else if(c=='[') st.push(']');
//            else if(st.isEmpty() || st.pop()!=c) return false;
//        }
//        return st.isEmpty();
//    }

}
