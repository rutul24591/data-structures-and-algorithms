package Leetcode.Medium._7.ReverseInteger;

/**
        7. Reverse Integer

            Given a signed 32-bit integer x, return x with its digits reversed.
            If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

            Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

            Example 1:
                 Input: x = 123
                 Output: 321

            Example 2:
                 Input: x = -123
                 Output: -321

            Example 3:
                 Input: x = 120
                 Output: 21

             Constraints:
                -231 <= x <= 231 - 1
 */

public class ReverseInteger {
    /**
        Runtime: 48 ms, faster than 5.05% of Java online submissions for Reverse Integer.
        Memory Usage: 43.3 MB, less than 6.16% of Java online submissions for Reverse Integer.
     */
    public int reverse(int x) {
        long result = 0;
        while(x != 0){
            result = (result * 10) +  x % 10;
            x = x / 10;
        }
        return (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) ? 0 : (int) result;
    }

    /**
     * RUNTIME: 1ms
     * MEMORY : 43.3 Mb
     */
    public int reverseSecond(int x) {
        int result = 0;
        while(x != 0){
            int lastDigit = x % 10;
            int newResult = (result * 10) +  lastDigit;
            if(result != (newResult - lastDigit) / 10){
                return 0;
            }
            x = x / 10;
            result = newResult;
        }
        return result;
    }

    public static void main(String[] args){
//        int num = -2135614545;
        int num = -1234;
        /*
          Solely printing out below 2 statements for information purpose
        */
        System.out.println("Integer Max_Value will provide 2 ^ 31: " +Integer.MAX_VALUE);
        System.out.println("Integer Min_Value will provide -2 ^ 31: " +Integer.MIN_VALUE);

        ReverseInteger instance = new ReverseInteger();
        int reversedInteger = instance.reverse(num);
        int reversedInteger2 = instance.reverseSecond(num);
        System.out.println("Reversed Integer: " +reversedInteger);
        System.out.println("Reversed Integer 2: " +reversedInteger2);
    }
}
