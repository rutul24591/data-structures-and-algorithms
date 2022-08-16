package Leetcode.Easy._136.SingleNumber;

/**
 *      Bitwise XOR (exclusive or) "^" is an operator in Java that provides the answer '1'
 *      if both of the bits in its operands are different,
 *      if both of the bits are same then the XOR operator gives the result '0'.
 *      XOR is a binary operator that is evaluated from left to right.
 * */
public class Practice {
    public int singleNumber(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int result = nums[0];

        for(int i = 1 ; i < nums.length; i++){
            result = result ^ nums[i]; // XOR operator
        }

        return result;
    }

    public static void main(String[] args){
        Practice instance = new Practice();
        int[] nums = {2,1,2,3,4,4,3};

        int result = instance.singleNumber(nums);
        System.out.println("Result: " +result);
    }
}
