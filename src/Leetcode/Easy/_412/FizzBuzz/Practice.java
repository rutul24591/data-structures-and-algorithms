package Leetcode.Easy._412.FizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Practice {
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

    public static void main(String[] args){
        int k = 15;
        Practice instance = new Practice();
        List<String> result;
        result = instance.fizzBuzz(k);
        System.out.println("Result: " +result);
    }
}
