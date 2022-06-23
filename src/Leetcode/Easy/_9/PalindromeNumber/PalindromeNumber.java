package Leetcode.Easy._9.PalindromeNumber;

/*
    Palindrome Number

        Given an integer x, return true if x is palindrome integer.

        An integer is a palindrome when it reads the same backward as forward.

        For example, 121 is a palindrome while 123 is not.


        Example 1:

            Input: x = 121
            Output: true
            Explanation: 121 reads as 121 from left to right and from right to left.

        Example 2:

            Input: x = -121
            Output: false
            Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

        Example 3:

            Input: x = 10
            Output: false
            Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

        Constraints:

            -231 <= x <= 231 - 1


        Follow up: Could you solve it without converting the integer to a string?
*/

public class PalindromeNumber {
    public boolean palindromeNumber(int x) {
        int copyX = x;
        int result = 0;     // Used to check and compare with x after manipulations

        if(x < 0){
            return false;
        }

        while(x != 0){
            result = (x % 10) + (result * 10);
            x = x/10;
        }

        return result == copyX;  // result == copyX ? true : false
    }
}
