package Leetcode.Easy._70.ClimbingStairs;

/**
 *          70. Climbing Stairs
 *
 *              You are climbing a staircase. It takes n steps to reach the top.
 *              Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 *
 *
 *              Example 1:
 *                  Input: n = 2
 *                  Output: 2
 *                  Explanation: There are two ways to climb to the top.
 *                      1. 1 step + 1 step
 *                      2. 2 steps
 *
 *              Example 2:
 *                  Input: n = 3
 *                  Output: 3
 *                  Explanation: There are three ways to climb to the top.
 *                      1. 1 step + 1 step + 1 step
 *                      2. 1 step + 2 steps
 *                      3. 2 steps + 1 step
 *
 *              Constraints:
 *                  1 <= n <= 45
 *
 *              Submission Details:
 *                  Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
 *                  Memory Usage: 41.5 MB, less than 11.61% of Java online submissions for Climbing Stairs.
 */
public class ClimbingStairs {
    public int climbStairs(int n) {
        if(n == 1) {
            return 1;
        }
        int way1 = 1;
        int way2 = 2;

        int result = way2;

        for(int i = 2; i < n; i++){
            result = way1 + way2;
            way1 = way2;
            way2 = result;
        }

        return result;
    }

    public static void main(String[] args){
        int x = 4;
        ClimbingStairs instance = new ClimbingStairs();
        int result = instance.climbStairs(x);
        System.out.println("RESULT: " +result);
    }
}
