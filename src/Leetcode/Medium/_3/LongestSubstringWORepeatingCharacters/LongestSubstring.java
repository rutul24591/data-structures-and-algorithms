package Leetcode.Medium._3.LongestSubstringWORepeatingCharacters;

import java.util.HashMap;

/*  3. Longest Substring Without Repeating Characters (medium)

        Given a string s, find the length of the longest substring without repeating characters.

        Example 1:

            Input: s = "abcabcbb"
            Output: 3
            Explanation: The answer is "abc", with the length of 3.

        Example 2:

            Input: s = "bbbbb"
            Output: 1
            Explanation: The answer is "b", with the length of 1.

        Example 3:

            Input: s = "pwwkew"
            Output: 3
            Explanation: The answer is "wke", with the length of 3.
            Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

        Constraints:

            0 <= s.length <= 5 * 104
            s consists of English letters, digits, symbols and spaces.

        Submission Results:
            Runtime: 12 ms, faster than 54.46% of Java online submissions for Longest Substring Without Repeating Characters.
            Memory Usage: 44.9 MB, less than 51.78% of Java online submissions for Longest Substring Without Repeating Characters.
*/

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int start = 0;

        /* Creating a hashmap to store the last position of occurrence */
        HashMap<Character, Integer> map = new HashMap<>();

        /* Loop till length of string */
        for(int i=0; i < s.length(); i++){
            /* Get and store current character at ith index in the string */
            char ch = s.charAt(i);

            /* Checking if we have already seen the element(character) or not */
            if(map.containsKey(ch) && map.get(ch) >= start){
                /* If element is sighted, move the start pointer to position after the last occurrence */
                start = map.get(ch)+1;
            }else{
                result = Math.max(result, i - start + 1);
            }
            /* Putting(Insert initial) or Updating the last seen value of the character. */
            map.put(ch, i);
        }
        return result;
    }

    public static void main(String[] args){
        String s = "pwwkew";
        String s1 = "tmmzuxt";
        LongestSubstring instance = new LongestSubstring();

        int result = instance.lengthOfLongestSubstring(s1);
//        int result = instance.lengthOfLongestSubstring(s);
        System.out.println("RESULT in main: " +result);
    }
}
