package Leetcode.Easy._169.MajorityElement;

public class Practice {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;   // Refer to InterestingNotes -> DifferenceBetweenIntAndInteger
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            count = count + (candidate == num ? 1 : -1);
        }
        return candidate;
    }

    public static void main(String[] args){
        int[] nums = {1,5,4,5,5,6,7,4,5,8,5,5,5,5};
        Practice instance = new Practice();
        int result = instance.majorityElement(nums);
        System.out.println("Result: "+ result);
    }
}
