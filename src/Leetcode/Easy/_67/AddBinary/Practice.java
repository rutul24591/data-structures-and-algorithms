package Leetcode.Easy._67.AddBinary;

public class Practice {
    public String addBinary(String s1, String s2){
        // Initialize digit carry
        int carry = 0;

        // Initialize result
        StringBuilder result = new StringBuilder();

        // Last Character index for both s1 n s2.
        int s1Length = s1.length() - 1, s2Length = s2.length() - 1;

        // Traverse both strings starting
        // from last characters
        while(s1Length >= 0 || s2Length >= 0 || carry != 0){
            // If we directly assign char variable to int, it will return ASCII value of given character.
            // i.e decimal value of digit 0 (48) and digit 1(49) in ascii table.
            // That is the reason for doing - '0' here.
            int num1 = s1Length >= 0 ? s1.charAt(s1Length) - '0' : 0;
            int num2 = s2Length >= 0 ? s2.charAt(s2Length) - '0' : 0;

            // Sum will never be greater than 2.
            int sum = num1 + num2 + carry;
            result.append(sum%2);
            carry = sum / 2;
            s1Length--;
            s2Length--;
        }
        System.out.println("String Builder: " +result);
        // As we appended the digits we need to return the reverse string.
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Practice instance = new Practice();
        String s1 = "1010";
        String s2 = "1011";

        String result = instance.addBinary(s1,s2);

        System.out.println("Result:" +result);
    }
}
