package Leetcode.Easy._1528.ShuffleString;

import java.util.Arrays;

public class Practice {
    public String restoreString(String s, int[] indices) {
        char[] ch = new char[s.length()];   // Take indices.length or s.length
        for(int i = 0; i < indices.length; i++) {
            ch[indices[i]] = s.charAt(i);
        }

        return new String(ch);
    }
    public static void main(String[] args) {
        Practice instance = new Practice();
        String s = "codeleet";
        int[] indices = { 4,5,6,7,0,2,1,3 };

        String result = instance.restoreString(s, indices);

        System.out.println("String: " +s);
        System.out.println("Indices: " + Arrays.toString(indices));

        System.out.println("Result:" + result);
    }
}
