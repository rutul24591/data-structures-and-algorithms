package Leetcode.Easy._9.PalindromeNumber;

public class Practice {
    public boolean palindromeNumber(int x) {
        if(x < 0){
            return false;
        }
        int result = 0;
        int check = x;
        while(check > 0){
            result = (result * 10) + (check % 10);
            check = check / 10;
        }

        return result == x;
    }
}
