package Stack;
import java.util.*;
public class DuplicateParenthesis {
    public static boolean isDuplicate(String s){
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == ')'){
                int count = 0;
                while(st.pop() != '('){
                    count++;
                }
                if(count < 1){
                    return true;
                }
            } else{
                st.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "(b+c-d+(c))";
        System.out.println(isDuplicate(s));
    }
}
