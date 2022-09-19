package Leetcode.Easy._771.JewelsAndStones;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Practice {
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
