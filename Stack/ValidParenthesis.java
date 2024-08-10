package Stack;
import java.util.*;
public class ValidParenthesis {
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            } else{
                if(st.isEmpty()){
                    return false;
                }
                if((ch == ')' && st.peek() == '(') || (ch == '}' && st.peek() == '{') || (ch == ']' && st.peek() == '[')){
                    st.pop();
                } else{
                    return false;
                }
            }
        }
        if(st.isEmpty()){
            return true;
        } else{
            return false;
        }
    }
    public static void main(String[] args) {
        String s = "(())";
        System.out.println(isValid(s));
    }
}
