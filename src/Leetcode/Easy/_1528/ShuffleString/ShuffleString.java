package Leetcode.Easy._1528.ShuffleString;

import java.util.Arrays;

/*
    1528. Shuffle String

        You are given a string s and an integer array indices of the same length.
        The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.

        Return the shuffled string.



        Example 1:
            Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
            Output: "leetcode"
            Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

        Example 2:
            Input: s = "abc", indices = [0,1,2]
            Output: "abc"
            Explanation: After shuffling, each character remains in its position.


        Constraints:
            s.length == indices.length == n
            1 <= n <= 100
            s consists of only lowercase English letters.
            0 <= indices[i] < n
            All values of indices are unique.

        Submission Details:
            Runtime: 2 ms, faster than 58.23% of Java online submissions for Shuffle String.
            Memory Usage: 44.7 MB, less than 52.74% of Java online submissions for Shuffle String.
 */
public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        char[] ch = new char[s.length()];   // Take indices.length or s.length
        for(int i = 0; i < indices.length; i++) {
            ch[indices[i]] = s.charAt(i);
        }

        return new String(ch);
    }
    public static void main(String[] args) {
        ShuffleString instance = new ShuffleString();
        String s = "codeleet";
        int[] indices = { 4,5,6,7,0,2,1,3 };

        String result = instance.restoreString(s, indices);

        System.out.println("String: " +s);
        System.out.println("Indices: " +Arrays.toString(indices));

        System.out.println("Result:" + result);
    }
}
