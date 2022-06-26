package Leetcode.Easy._67.AddBinary;

/**
        67. Add Binary
        Given two binary strings a and b, return their sum as a binary string.

            Example 1:
                 Input: a = "11", b = "1"
                 Output: "100"

            Example 2:
                 Input: a = "1010", b = "1011"
                 Output: "10101"


            Constraints:
                 1 <= a.length, b.length <= 104
                 a and b consist only of '0' or '1' characters.
                 Each string does not contain leading zeros except for the zero itself.

            Submission Details
                 Runtime: 47 ms, faster than 5.57% of Java online submissions for Add Binary.
                 Memory Usage: 42.3 MB, less than 81.92% of Java online submissions for Add Binary.
 */
public class AddBinary {
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
        AddBinary instance = new AddBinary();
        String s1 = "1010";
        String s2 = "1011";

        String result = instance.addBinary(s1,s2);

        System.out.println("Result:" +result);
    }
}
