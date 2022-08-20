package Leetcode.Easy._20.ValidParenthesis;

import java.util.HashMap;
import java.util.Stack;

public class Practice {
    public static final HashMap<Character, Character> map = new HashMap<>(){
        {
            put('{','}');
            put('[',']');
            put('(',')');
        }
    };

    public boolean isValid(String s){
        /* If the string length is odd, we return false immediately */
        if(s.length() % 2 == 1){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()) {
            /* For opening brackets {, (, [ */
            if(map.containsKey(ch)){
                stack.push(map.get(ch));
            }else {
                /*  For closing brackets ), }, ].
                 *   Here we do check for stack.isEmpty(), because if string starts with either of closing brackets i.e ], }, ),
                 *   then stack would be empty. For Eg. `}(` would result in error.
                 * */
                if(stack.isEmpty() || stack.pop() != ch){
                    return false;
                }
            }
        }
        /* After all checking above the stack should be empty(parenthesis are valid) and if is not then parenthesis are not valid*/
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Practice instance = new Practice();
        String s = "}(";

        boolean isValid = instance.isValid(s);

        System.out.println("String: " +s);
        System.out.println("Result:" +isValid);
    }
}
