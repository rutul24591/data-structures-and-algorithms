package Leetcode.Easy._13.RomanToInteger;

import java.util.HashMap;

public class Practice {
    public int romanToInt(String s){
        int result = 0;
        if(s == null || s.length() == 0){
            return -1;
        }

        HashMap<Character, Integer> map = new HashMap<>();
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
        Practice instance = new Practice();
        String s =  "MCMXCIV";

        int result = instance.romanToInt(s);
        System.out.println("Result: " + result);    // Should be 1994
    }
}
