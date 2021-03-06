package info.sandroalmeida.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

    /*
    *   Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
        Note that an empty string is also considered valid.
    * */

    public static boolean solution(String s){

        Deque<Character> stack = new ArrayDeque<>();
        char[] items = s.toCharArray();

        for(char c: items){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
                continue;
            }
            if(!stack.isEmpty()){
                if(c == ')'){
                    if(stack.getFirst().equals('(')){
                        stack.pop();
                    }else{
                        return false;
                    }
                }else if(c == ']'){
                    if(stack.getFirst().equals('[')){
                        stack.pop();
                    }else{
                        return false;
                    }
                }else if(c == '}'){
                    if(stack.getFirst().equals('{')){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
            }else{
                return false;
            }
        }

        return stack.isEmpty();
    }

}
