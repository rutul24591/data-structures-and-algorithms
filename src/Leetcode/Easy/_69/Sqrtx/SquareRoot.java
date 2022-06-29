package Leetcode.Easy._69.Sqrtx;

/**
        69. Sqrt(x)

        Given a non-negative integer x, compute and return the square root of x.
        Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

        Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

        Example 1:
             Input: x = 4
             Output: 2

        Example 2:
             Input: x = 8
             Output: 2

        Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.


        Constraints:
             0 <= x <= 231 - 1

        Submission Details(binary search)
             Runtime: 2 ms, faster than 82.09% of Java online submissions for Sqrt(x).
             Memory Usage: 40.9 MB, less than 77.99% of Java online submissions for Sqrt(x).

         Time complexity: O(log n).
            The time complexity of the binary search is O(log n).
         Space Complexity: O(1).
            Constant extra space is needed.


 */
public class SquareRoot {
    public int findRoot(int num){
        //Edge cases
        if(num == 0 || num == 1){
            return num;
        }
        /* Perform Binary search */
        long start = 1;
        long end = num;
        while(start <= end){
            /*
                  To calculate mid 'left + right' may cause the Integer Overflow, meaning that left+right > 2147483647
                  To avoid overflow we use this instead of left + right / 2;
            */
            long mid = start + (end-start)/2;

            if(mid * mid == num){
                return (int) mid;
            }else if(mid * mid < num){
                start = (int) mid + 1;
            }else{
                end = (int) mid - 1;
            }
        }
        return (int)end;
    }

    public static void main(String[] args){
        int x = 16, y = 26;
        SquareRoot instance = new SquareRoot();
        int result1 = instance.findRoot(x);
        int result2 = instance.findRoot(y);
        System.out.println("square root of 16: " +result1);
        System.out.println("square root of 26: " +result2);
    }
}
