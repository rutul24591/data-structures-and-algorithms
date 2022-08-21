package Leetcode.Easy._125.ValidPalindrome;

public class Practice {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;

        while( i < j ){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }else {
                if (Character.toLowerCase(s.charAt(i)) != Character
                    .toLowerCase(s.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    /* Leetcode complains this is 6ms */
    public boolean isPalindrome2(String s) {
        int i = 0, j = s.length() - 1;

        while( i < j ){
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }else if(!Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }else {
                if (Character.toLowerCase(s.charAt(i)) != Character
                    .toLowerCase(s.charAt(j))) {
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        String s1 = "A@hello";
        Practice instance = new Practice();
        boolean result = instance.isPalindrome(s);
        boolean resultForS1 = instance.isPalindrome(s1);
        System.out.println("Result For S:" +result);
        System.out.println("Result For S1:" +resultForS1);
    }
}
