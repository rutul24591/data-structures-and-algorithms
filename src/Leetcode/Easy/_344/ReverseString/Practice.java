package Leetcode.Easy._344.ReverseString;

import java.util.Arrays;

public class Practice {
    public void reverseString(char[] s) {
        for(int i = 0, j= s.length - 1; i < j; i++, j--){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
        System.out.println("Reversed string: " + Arrays.toString(s));
    }

    public static void main(String[] args) {
        Practice instance = new Practice();
        char[] s = {'e','d','o','c','t','e','l'};
        char[] s1 = {'h','e','l','l','o'};
        char[] s2 = {'e','d','o','c','t','e','e','l'};
        char[] s3 = {'o','l','l','e','H'};

        instance.reverseString(s);
        instance.reverseString(s1);
    }
}
