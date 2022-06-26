package Leetcode.Easy._13.RomanToInteger;

import java.util.HashMap;

/*

        13. Roman to Integer

            Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

                    Symbol       Value
                    I             1
                    V             5
                    X             10
                    L             50
                    C             100
                    D             500
                    M             1000

            For example, 2 is written as II in Roman numeral, just two ones added together.
            12 is written as XII, which is simply X + II.
            The number 27 is written as XXVII, which is XX + V + II.

            Roman numerals are usually written largest to smallest from left to right.
            However, the numeral for four is not IIII.
            Instead, the number four is written as IV.
            Because the one is before the five we subtract it making four.
            The same principle applies to the number nine, which is written as IX.

            There are six instances where subtraction is used:

                    I can be placed before V (5) and X (10) to make 4 and 9.
                    X can be placed before L (50) and C (100) to make 40 and 90.
                    C can be placed before D (500) and M (1000) to make 400 and 900.


            Given a roman numeral, convert it to an integer.


            Example 1:
                Input: s = "III"
                Output: 3
                Explanation: III = 3.

            Example 2:
                Input: s = "LVIII"
                Output: 58
                Explanation: L = 50, V= 5, III = 3.

            Example 3:
                Input: s = "MCMXCIV"
                Output: 1994
                Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


            Constraints:
                1 <= s.length <= 15
                s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
                It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */

public class RomanToInteger {
    public int romanToInt(String s){
        int result = 0;
        if(s == null || s.length() == 0){
            return -1;
        }

        HashMap<Character, Integer> map = new HashMap();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for(int i = 0; i < s.length(); i++){
            if(i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i-1))){
                // Added i > 0 to above condition as below statement would result in IndexOutOfBoundException when getting i-1 for value i=0;
                result = result + map.get(s.charAt(i)) - 2 * (map.get(s.charAt(i-1)));
            }else {
                // If i = 0 or current character value(int) in map is smaller than previous character value in map
                result = result + map.get(s.charAt(i));
            }
        }

        return result;
    }

    public static void main(String[] args){
        RomanToInteger instance = new RomanToInteger();
        String s =  "MCMXCIV";

        int result = instance.romanToInt(s);
        System.out.println("Result: " + result);    // Should be 1994
    }
}
