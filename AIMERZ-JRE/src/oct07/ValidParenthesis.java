package oct07;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack();
        for(char ch : s.toCharArray()){
            if(ch == '{' || ch == '(' || ch == '[') stk.push(ch);
            else{
                if(!stk.isEmpty()){
                    if(ch == '}' && stk.peek() == '{' || ch == ']' && stk.peek()=='[' ||
                            ch == ')' && stk.peek() == '(') stk.pop();
                    else return false;
                }
                else return false;
            }
        }
        return stk.isEmpty();
    }
}
