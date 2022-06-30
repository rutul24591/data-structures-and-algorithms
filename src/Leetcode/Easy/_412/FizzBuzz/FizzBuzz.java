package Leetcode.Easy._412.FizzBuzz;

import java.util.ArrayList;
import java.util.List;


/**
        412. Fizz Buzz

            Given an integer n, return a string array answer (1-indexed) where:
                 answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
                 answer[i] == "Fizz" if i is divisible by 3.
                 answer[i] == "Buzz" if i is divisible by 5.
                 answer[i] == i (as a string) if none of the above conditions are true.


            Example 1:

                 Input: n = 3
                 Output: ["1","2","Fizz"]

            Example 2:

                 Input: n = 5
                 Output: ["1","2","Fizz","4","Buzz"]

            Example 3:

                 Input: n = 15
                 Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]


            Constraints:

                 1 <= n <= 104

            Submission Details:
                 Runtime: 2 ms, faster than 70.16% of Java online submissions for Fizz Buzz.
                 Memory Usage: 48 MB, less than 68.10% of Java online submissions for Fizz Buzz.

            Time: O(n)          // n is the input number
            Space: O(1)
 */

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 ==0){
                result.add("FizzBuzz");
            }else if(i % 3 == 0){
                result.add("Fizz");
            }else if(i % 5 == 0){
                result.add("Buzz");
            }else{
                result.add(Integer.toString(i));
            }
        }

        return result;
    }

    /* RunTime: 2ms, Memory: 48MB */
    /*
        public List<String> fizzBuzz2(int n) {
            List<String> result = new ArrayList<>();
            int i = 1;
            while(i <= n){
                if(i % 3 == 0 && i % 5 ==0){
                    result.add("FizzBuzz");
                }else if(i % 3 == 0){
                    result.add("Fizz");
                }else if(i % 5 == 0){
                    result.add("Buzz");
                }else{
                    result.add(String.valueOf(i));
                }
                i++;
            }
            return result;
        }
    */

    public static void main(String[] args){
        int k = 15;
        FizzBuzz instance = new FizzBuzz();
        List<String> result;
        result = instance.fizzBuzz(k);
        System.out.println("Result: " +result);
    }
}
