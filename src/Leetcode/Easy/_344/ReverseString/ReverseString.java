package Leetcode.Easy._344.ReverseString;

import java.util.Arrays;

/**
        @author: rutulamin
        @tag:   Arrays, Top 100 interview questions
        @date:  29th June 2022

        344. Reverse String

                Write a function that reverses a string. The input string is given as an array of characters s.
                You must do this by modifying the input array in-place with O(1) extra memory.


                 Example 1:
                     Input: s = ["h","e","l","l","o"]
                     Output: ["o","l","l","e","h"]

                 Example 2:
                     Input: s = ["H","a","n","n","a","h"]
                     Output: ["h","a","n","n","a","H"]

                 Constraints:
                     1 <= s.length <= 105
                     s[i] is a printable ascii character.

                 Submission Details:
                     Runtime: 1 ms, faster than 99.91% of Java online submissions for Reverse String.
                     Memory Usage: 54.3 MB, less than 66.94% of Java online submissions for Reverse String.

 */
public class ReverseString {
    public void reverseString(char[] s) {
        for(int i = 0, j= s.length - 1; i < j; i++, j--){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        System.out.println("Reversed string: " +Arrays.toString(s));
    }

    /* Simply making use of while loop below */

    /**
        public void reverseStringUno(char[] s) {
            int length = s.length;
            int start = 0;
            int end = length - 1;
            while(start < end){
                char temp = s[start];
                s[start] = s[end];
                s[end] = temp;
                start++;
                end--;
            }

            System.out.println("Reversed string: " +Arrays.toString(s));
        }
    */

    public static void main(String[] args) {
        ReverseString instance = new ReverseString();
        char[] s = {'e','d','o','c','t','e','l'};
        char[] s1 = {'h','e','l','l','o'};
        char[] s2 = {'e','d','o','c','t','e','e','l'};
        char[] s3 = {'o','l','l','e','H'};

        instance.reverseString(s);
        instance.reverseString(s1);
        /*
                instance.reverseStringUno(s2);
                instance.reverseStringUno(s3);
        */
    }
}
