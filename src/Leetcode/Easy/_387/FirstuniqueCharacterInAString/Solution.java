package Leetcode.Easy._387.FirstuniqueCharacterInAString;


/*
        @author: Rutul Amin
        @tag: String, Top Interview questions
        @date: 13th July 2022

        387. First Unique Character in a String

        Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

        Example 1:
            Input: s = "leetcode"
            Output: 0

        Example 2:
            Input: s = "loveleetcode"
            Output: 2

        Example 3:
            Input: s = "aabb"
            Output: -1

        Constraints:
            1 <= s.length <= 105
            s consists of only lowercase English letters.

        Time:  0(n)
        Space: 0(1)  // No extra space is required
*/
public class Solution {
    public int firstUniqChar(String s) {
        /* Array of length 26 to store occurrence of each letter */
        int[] freq = new int[26];

        /* Let's say c='a' then it will increase value of 0 index by 1 */
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
            //freq[c - 'a'] = freq[c - 'a'] + 1;
        }

        for(int i = 0; i < s.length(); i++){
            int ch = s.charAt(i) - 'a';
            /* Check the first letter of string whose occurrence is 1.  */
            if(freq[ch] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String s = "loveleetcode";
        Solution instance = new Solution();
        int result = instance.firstUniqChar(s);
        System.out.println("Result: "+result);
    }
}
