package Leetcode.Easy._374.GuessnumberHigherOrLower;

/*
        374. Guess Number Higher or Lower

        We are playing the Guess Game. The game is as follows:
        I pick a number from 1 to n. You have to guess which number I picked.

        Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

        You call a pre-defined API int guess(int num), which returns three possible results:
            -1: Your guess is higher than the number I picked (i.e. num > pick).
            1: Your guess is lower than the number I picked (i.e. num < pick).
            0: your guess is equal to the number I picked (i.e. num == pick).

        Return the number that I picked.

        Example 1:
            Input: n = 10, pick = 6
            Output: 6

        Example 2:
            Input: n = 1, pick = 1
            Output: 1

        Example 3:
            Input: n = 2, pick = 1
            Output: 1


        Constraints:
            1 <= n <= 231 - 1
            1 <= pick <= n

        Submission Details:
            Runtime: 0 ms, faster than 100.00% of Java online submissions for Guess Number Higher or Lower.
            Memory Usage: 41.2 MB, less than 19.02% of Java online submissions for Guess Number Higher or Lower.

        Time: O(logn) // Binary Search is used.
        Space: O(1) // No extra space is used.
*/

public class Solution extends GuessGame{
    public int guessNumber(int num){
        int left = 0, right = num;
        while(left <= right){
            int mid = left + (right-left) / 2;
            if(guess(mid) == 0){
                return mid;
            }else if(guess(mid) == -1){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        return -1;
    }

    /*Approach 2.
    *
    * Time: O(n)  // We scan all the numbers from 1 to n.
    * Space: O(1) // No extra space is used.
     *
    */

    public int guessNumber2(int n) {
        for (int i = 1; i < n; i++)
            if (guess(i) == 0)
                return i;
        return n;
    }
}
