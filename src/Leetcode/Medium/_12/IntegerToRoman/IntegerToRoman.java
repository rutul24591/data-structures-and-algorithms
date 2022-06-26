package Leetcode.Medium._12.IntegerToRoman;

import java.util.HashMap;

/*
        12. Integer to Roman

            Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

                Symbol       Value
                I             1
                V             5
                X             10
                L             50
                C             100
                D             500
                M             1000

            For example, 2 is written as II in Roman numeral, just two one's added together.
            12 is written as XII, which is simply X + II.
            The number 27 is written as XXVII, which is XX + V + II.

            Roman numerals are usually written largest to smallest from left to right.
            However, the numeral for four is not IIII. Instead, the number four is written as IV.
            Because the one is before the five we subtract it making four.
            The same principle applies to the number nine, which is written as IX.

            There are six instances where subtraction is used:
                I can be placed before V (5) and X (10) to make 4 and 9.
                X can be placed before L (50) and C (100) to make 40 and 90.
                C can be placed before D (500) and M (1000) to make 400 and 900.


            Given an integer, convert it to a roman numeral.

            Example 1:
                Input: num = 3
                Output: "III"
                Explanation: 3 is represented as 3 ones.

            Example 2:
                Input: num = 58
                Output: "LVIII"
                Explanation: L = 50, V = 5, III = 3.

            Example 3:
                Input: num = 1994
                Output: "MCMXCIV"
                Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


            Constraints:
                1 <= num <= 3999

            Submission Details(Approach 1):
                Runtime: 11 ms, faster than 46.00% of Java online submissions for Integer to Roman.
                Memory Usage: 46.6 MB, less than 27.14% of Java online submissions for Integer to Roman.

 */
public class IntegerToRoman {
    /* Approach 1 */
    public String intToRoman(int num) {
        StringBuilder answer= new StringBuilder();
        while(num>0){
            if(num>=1000){
                num-=1000;
                answer.append("M");
            }else if(num>=900){
                num-=900;
                answer.append("CM");
            }else if(num>=500){
                num-=500;
                answer.append("D");
            }else if(num>=400){
                num-=400;
                answer.append("CD");
            }else if(num>=100){
                num-=100;
                answer.append("C");
            }else if(num>=90){
                num-=90;
                answer.append("XC");
            }else if(num>=50){
                num-=50;
                answer.append("L");
            }else if(num>=40){
                num-=40;
                answer.append("XL");
            }else if(num>=10){
                num-=10;
                answer.append("X");
            }else if(num>=9){
                num-=9;
                answer.append("IX");
            }else if(num>=5){
                num-=5;
                answer.append("V");
            }else if(num>=4){
                num-=4;
                answer.append("IV");
            }else{
                num-=1;
                answer.append("I");
            }
        }
        return answer.toString();

    }
    public static void main(String[] args){
        IntegerToRoman instance = new IntegerToRoman();
        int num = 1994;

        String result = instance.intToRoman(num);
        System.out.println("Result: " + result);    // Should be 'MCMXCIV'
    }
}
