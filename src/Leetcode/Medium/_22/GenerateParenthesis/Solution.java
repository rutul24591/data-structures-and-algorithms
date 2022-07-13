package Leetcode.Medium._22.GenerateParenthesis;
import java.util.*;

/*
        @author: Rutul Amin
        @tag: Recursion, Backtracking, ArrayList, Top interview questions
        @date: 13 July 2022

        22. Generate Parentheses

        Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

        Example 1:
            Input: n = 3
            Output: ["((()))","(()())","(())()","()(())","()()()"]

        Example 2:
            Input: n = 1
            Output: ["()"]

        Constraints:
            1 <= n <= 8

        Submission Details:
            Runtime: 21 ms, faster than 5.71% of Java online submissions for Generate Parentheses.
            Memory Usage: 46.5 MB, less than 5.10% of Java online submissions for Generate Parentheses.
*/

public class Solution {
    /*
        Intuition
            To enumerate something, generally we would like to express it as a sum of disjoint subsets that are easier to count.
            Consider the closure number of a valid parentheses sequence S: the least index >= 0 so that S[0], S[1], ..., S[2*index+1] is valid.
            Clearly, every parentheses sequence has a unique closure number. We can try to enumerate them individually.

        Algorithm
            For each closure number c, we know the starting and ending brackets must be at index 0 and 2*c + 1.
            Then, the 2*c elements between must be a valid sequence, plus the rest of the elements must be a valid sequence.

        Time and Space complexity
            O(4^n/sqr(n))
    */
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        if (n == 0) {
            ans.add("");
        } else {
            for (int c = 0; c < n; ++c){
                for (String left: generateParenthesis(c)){
                    for (String right: generateParenthesis(n-1-c)){
                        ans.add("(" + left + ")" + right);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int num = 3;
        Solution instance = new Solution();
        List<String> result = instance.generateParenthesis(num);
        System.out.println("Result: "+result);
    }
}
