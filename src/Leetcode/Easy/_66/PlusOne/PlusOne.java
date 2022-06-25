package Leetcode.Easy._66.PlusOne;

import java.util.Arrays;

/**
        66. Plus One

            You are given a large integer represented as an integer array digits,
            where each digits[i] is the ith digit of the integer.
            The digits are ordered from most significant to least significant in left-to-right order.
            The large integer does not contain any leading 0's.

            Increment the large integer by one and return the resulting array of digits.



            Example 1:

                 Input: digits = [1,2,3]
                 Output: [1,2,4]
                 Explanation: The array represents the integer 123.
                 Incrementing by one gives 123 + 1 = 124.
                 Thus, the result should be [1,2,4].

            Example 2:

                 Input: digits = [4,3,2,1]
                 Output: [4,3,2,2]
                 Explanation: The array represents the integer 4321.
                 Incrementing by one gives 4321 + 1 = 4322.
                 Thus, the result should be [4,3,2,2].

            Example 3:

                 Input: digits = [9]
                 Output: [1,0]
                 Explanation: The array represents the integer 9.
                 Incrementing by one gives 9 + 1 = 10.
                 Thus, the result should be [1,0].


            Constraints:

                 1 <= digits.length <= 100
                 0 <= digits[i] <= 9
                 digits does not contain any leading 0's.

            Submission summary
                 Runtime: 18 ms, faster than 5.64% of Java online submissions for Plus One.
                 Memory Usage: 43.1 MB, less than 7.47% of Java online submissions for Plus One.

            Time : O(N); Space: O(1)
 */
public class PlusOne {
    public int[] plusOne(int[] digits){
        int length = digits.length;
        int[] result = new int[length];

        int carry = 1;

        for(int i = length - 1; i >= 0; i--){
            int digit = carry + digits[i];
            System.out.println("Digit: "+digit);
            result[i] = digit % 10;
            System.out.println("result[i]: "+result[i]);
            carry = digit / 10;
        }

        /* In cases for 99, 999, 9999,... we need to add 1 in front.
            So we need to change the size of array and assign the first digit to 1
        */
        if(carry != 0){
            result = new int[length + 1];
            result[0] = 1;
        }
        return result;
    }

    public static void main(String[] args) {
        PlusOne instance = new PlusOne();
        int[] digitArray = {9,9,9};
//        int[] digitArray = {1,2,3};

        int[] result = instance.plusOne(digitArray);

        System.out.println("digitArray: " +digitArray);
        System.out.println("Result:" +Arrays.toString(result));
    }
}
