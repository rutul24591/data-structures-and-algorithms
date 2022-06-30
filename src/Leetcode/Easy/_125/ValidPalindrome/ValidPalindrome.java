package Leetcode.Easy._125.ValidPalindrome;

/**
        @author: Rutul Amin
        @tag: String, 2 pointer solution
        @date: 30 June 2022

        125. Valid Palindrome

        A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
        removing all non-alphanumeric characters, it reads the same forward and backward.
        Alphanumeric characters include letters and numbers.

        Given a string s, return true if it is a palindrome, or false otherwise.

        Example 1:
            Input: s = "A man, a plan, a canal: Panama"
            Output: true
            Explanation: "amanaplanacanalpanama" is a palindrome.

        Example 2:
            Input: s = "race a car"
            Output: false
            Explanation: "raceacar" is not a palindrome.

        Example 3:
            Input: s = " "
            Output: true
            Explanation: s is an empty string "" after removing non-alphanumeric characters.

        Since an empty string reads the same forward and backward, it is a palindrome.


        Constraints:
            1 <= s.length <= 2 * 105
            s consists only of printable ASCII characters.

        Submission Details:
            Runtime: 4 ms, faster than 88.37% of Java online submissions for Valid Palindrome.
            Memory Usage: 43.1 MB, less than 82.25% of Java online submissions for Valid Palindrome.

        Time : O(N); Space: O(1)

 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while( i < j ){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }else {
                if (Character.toLowerCase(s.charAt(i)) != Character
                    .toLowerCase(s.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    /* Leetcode complains this is 6ms */
    public boolean isPalindrome2(String s) {
        int i = 0, j = s.length() - 1;

        while( i < j ){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }else {
                if (Character.toLowerCase(s.charAt(i)) != Character
                    .toLowerCase(s.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        String s1 = "A@hello";
        ValidPalindrome instance = new ValidPalindrome();
        boolean result = instance.isPalindrome(s);
        boolean resultForS1 = instance.isPalindrome(s1);
        System.out.println("Result For S:" +result);
        System.out.println("Result For S1:" +resultForS1);
    }
}
