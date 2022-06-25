package Leetcode.Easy._20.ValidParenthesis;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/*
    20. Valid Parentheses

        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.


        Example 1:

            Input: s = "()"
            Output: true

        Example 2:

            Input: s = "()[]{}"
            Output: true

        Example 3:

            Input: s = "(]"
            Output: false


        Constraints:

            1 <= s.length <= 104
            s consists of parentheses only '()[]{}'.

        Submission details:
        Runtime: 5 ms
        Memory Usage: 41.8 MB

        Time : O(N) ; Space O(N)
*/

public class ValidParenthesis {
    public static final HashMap <Character, Character> map = new HashMap<>(){
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
        Stack <Character> stack = new Stack<>();
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

    /* Implementation without using hashmap
        Runtime: 1 ms
        Memory Usage: 37.3 MB

        Time : O(N) ; Space O(N)

        public boolean isValid(String s) {
            if ((s.length() % 2 == 1)){
                return false;
            }else{
                Stack<Character> stack = new Stack<Character>();
                for (char c : s.toCharArray()) {
                    if (c == '(')
                        stack.push(')');
                    else if (c == '{')
                        stack.push('}');
                    else if (c == '[')
                        stack.push(']');
                    else if (stack.isEmpty() || stack.pop() != c)
                        return false;
                }
                return stack.isEmpty();
            }
        }

    */

    public static void main(String[] args) {
        ValidParenthesis instance = new ValidParenthesis();
        String s = "}(";

        boolean isValid = instance.isValid(s);

        System.out.println("String: " +s);
        System.out.println("Result:" +isValid);
    }
}
