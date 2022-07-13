package Leetcode.Easy._374.GuessnumberHigherOrLower;


public class GuessGame {
    /**
     * Forward declaration of guess API.
     * @param n  your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * int guess(int num);
     */
    public int guess(int n){
        return Integer.compare(4, n);
    }
}
