package Leetcode.Easy._771.JewelsAndStones;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
        @author: Rutul Amin
        @tag: String
        @date: 11th July 2022

        771. Jewels and Stones

        You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
        Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

        Letters are case sensitive, so "a" is considered a different type of stone from "A".

        Example 1:
            Input: jewels = "aA", stones = "aAAbbbb"
            Output: 3

        Example 2:
            Input: jewels = "z", stones = "ZZ"
            Output: 0


        Constraints:
            1 <= jewels.length, stones.length <= 50
            jewels and stones consist of only English letters.
            All the characters of jewels are unique.

        Submission Details(Approach 1):
            Runtime: 3 ms, faster than 34.58% of Java online submissions for Jewels and Stones.
            Memory Usage: 41.8 MB, less than 80.40% of Java online submissions for Jewels and Stones.

            Time: 0(n+m) where n and m is the size of jewels and stones string.
            Space: 0(n)  since we store the characters from the jewels string. The space complexity is dependent on the jewels string size.

        Submission Details(Approach 2):
            Runtime: 1 ms, faster than 97.75% of Java online submissions for Jewels and Stones.
            Memory Usage: 42.4 MB, less than 43.31% of Java online submissions for Jewels and Stones.

            Time: 0(n*m) nested for
            Space: 0(1)  since we do not use any array or vector. We are using only constant space. Thus the brute approach has constant space complexity.

        Submission Details(Approach 3): Optimal
            Runtime: 3 ms, faster than 34.58% of Java online submissions for Jewels and Stones.
            Memory Usage: 42 MB, less than 75.24% of Java online submissions for Jewels and Stones.

            Time: 0(n+m) where n and m is the size of jewels and stones string. The optimization is achieved because we utilized HashSets. Now, the time complexity has been reduced to linear.
            Space: 0(n)  since we store the characters from the jewels string. The space complexity is dependent on the jewels string size.

*/
public class Solution {
    /* Approach 1: Use Map(Improve 1)*/
    public static int numJewelsInStones(String jewels, String stones) {
        if(jewels.length() == 0){
            return 0;
        }
        int result = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0; i < jewels.length(); i++){
            if(!map.containsKey(jewels.charAt(i))){
                map.put(jewels.charAt(i), i);
            }
        }

        for(int j = 0; j < stones.length() ; j++){
            if(map.containsKey(stones.charAt(j))){
                result += 1;
            }
        }

        return result;
    }

    /* Approach 2 : Basic brute force*/
    public static int numJewelsInStones2(String jewels, String stones) {
        int count=0;
        for(int stoneIndex=0; stoneIndex<stones.length(); stoneIndex++) {
            for(int jewelIndex=0; jewelIndex<jewels.length(); jewelIndex++) {
                if(stones.charAt(stoneIndex)==jewels.charAt(jewelIndex))
                    count++;
            }
        }
        return count;
    }

    /* Approach 3: Optimal Hashset */
    public static int numJewelsInStones3(String jewels, String stones) {
        HashSet<Character> jewelSet = new HashSet<Character>();
        for(int i=0;i<jewels.length();i++){
            jewelSet.add(jewels.charAt(i));
        }

        int result = 0;
        for(int i=0;i<stones.length();i++){
            if(jewelSet.contains(stones.charAt(i))){
                result++;
            }
        }
        return result;
    }

    public static void main (String[] args) throws java.lang.Exception{
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels, stones));
        System.out.println(numJewelsInStones2(jewels, stones));
        System.out.println(numJewelsInStones3(jewels, stones));
    }
}
