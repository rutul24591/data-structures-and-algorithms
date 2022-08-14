package Leetcode.Easy._28.ImplementStrStr;

public class Practice {
    public int strStr(String haystack, String needle){
        if(haystack == " " || needle == " "){
            return 0;
        }

        if(haystack == null || needle == null || haystack.length() < needle.length()){
            return -1;
        }

        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            if(haystack.substring(i, i + needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Practice instance = new Practice();
        String s1 = "hello";
        String s2 = "ll";

        System.out.print("RESULT: " +instance.strStr(s1, s2));
    }
}
