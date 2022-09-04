package Leetcode.Easy._27.RemoveElement;

public class Practice {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }


    public static void main(String[] args) {
        Practice solution = new Practice();
        int[] nums = {3,2,3,3,2,5,6};
        int value = 3;

        int result = solution.removeElement(nums, value);

        System.out.println("RESULT:" +result);
    }
}
