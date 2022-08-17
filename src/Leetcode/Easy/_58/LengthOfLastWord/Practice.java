package Leetcode.Easy._58.LengthOfLastWord;

public class Practice {
    public int findLength(String s) {
        s = s.trim();
        int lastIndex = s.lastIndexOf(" ") + 1;
        System.out.println("lastIndex: " +lastIndex);
        return s.length() - lastIndex;
    }

    /* APPROACH 2:
        public int findLength(String s) {
            String[] arr = s.split(" ");
            return arr.length >= 1 ? arr[arr.length - 1].length() : 0;
        }
    */

    public static void main(String[] args){
        String s = "Hello World";
        LengthOfLastWord instance = new LengthOfLastWord();
        int result = instance.findLength(s);
        System.out.println("Result: " +result);
    }
}
