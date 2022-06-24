package Leetcode.Easy._58.LengthOfLastWord;
/*
     58. Length of Last Word

        Given a string s consisting of words and spaces, return the length of the last word in the string.
        A word is a maximal substring consisting of non-space characters only.

        Example 1:

            Input: s = "Hello World"
            Output: 5
            Explanation: The last word is "World" with length 5.

        Example 2:

            Input: s = "   fly me   to   the moon  "
            Output: 4
            Explanation: The last word is "moon" with length 4.

        Example 3:

            Input: s = "luffy is still joyboy"
            Output: 6
            Explanation: The last word is "joyboy" with length 6.

        Constraints:

            1 <= s.length <= 104
            s consists of only English letters and spaces ' '.
            There will be at least one word in s.
*/
public class LengthOfLastWord {
    public int findLength(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(" ") + 1;
        System.out.println("lastIndex: " +lastIndex);
        return s.length() - lastIndex;
    }

    /* APPROACH 2:
        public int findLength(String s) {
            String[] arr = s.split(" ");
            return arr.length >= 1 ? arr[arr.length - 1].length() : 0;
        }
    */

    public static void main(String[] args){
        String s = "Hello World";
        LengthOfLastWord instance = new LengthOfLastWord();
        int result = instance.findLength(s);
        System.out.println("Result: " +result);
    }
}
