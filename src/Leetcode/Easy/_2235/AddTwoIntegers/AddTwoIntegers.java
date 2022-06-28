package Leetcode.Easy._2235.AddTwoIntegers;

/**
        2235. Add Two Integers

                Given two integers num1 and num2, return the sum of the two integers.

                Example 1:
                     Input: num1 = 12, num2 = 5
                     Output: 17
                     Explanation: num1 is 12, num2 is 5, and their sum is 12 + 5 = 17, so 17 is returned.

                Example 2:
                     Input: num1 = -10, num2 = 4
                     Output: -6
                     Explanation: num1 + num2 = -6, so -6 is returned.


                Constraints:
                    -100 <= num1, num2 <= 100

                Note: I mean why??
 */
public class AddTwoIntegers {
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        AddTwoIntegers instance = new AddTwoIntegers();
        int num1 = -10;
        int num2 = 99;
        int result = instance.sum(num1, num2);
        System.out.println("Result: " +result);
    }
}
