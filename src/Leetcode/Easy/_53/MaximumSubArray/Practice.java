package Leetcode.Easy._53.MaximumSubArray;

public class Practice {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0){
            return 0;
        }else if(nums.length == 1){
            return nums[0];
        }

        int result = nums[0];
        int maxSum = result;

        for(int i = 1; i< nums.length; i++){
            if(maxSum < 0){
                maxSum = nums[i];
            }else{
                maxSum = maxSum + nums[i];
            }
            result = Math.max(result, maxSum);
        }

        return result;
    }

    public static void main(String[] args){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        Practice instance = new Practice();
        int max_sum = instance.maxSubArray(nums);

        System.out.println("Max SUM: "+max_sum);
    }
}
