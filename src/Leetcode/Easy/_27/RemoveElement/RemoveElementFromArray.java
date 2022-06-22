package Leetcode.Easy._27.RemoveElement;

/*
 Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The relative order of the elements may be changed.

 Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

 Return k after placing the final result in the first k slots of nums.

 Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

 Custom Judge:

 The judge will test your solution with the following code:

 int[] nums = [...]; // Input array
 int val = ...; // Value to remove
 int[] expectedNums = [...]; // The expected answer with correct length.
 // It is sorted with no values equaling val.

 int k = removeElement(nums, val); // Calls your implementation

 assert k == expectedNums.length;
 sort(nums, 0, k); // Sort the first k elements of nums
 for (int i = 0; i < actualLength; i++) {
 assert nums[i] == expectedNums[i];
 }
 If all assertions pass, then your solution will be accepted.

 */
    class RemoveElementFromArray {
        public int removeElementBasic(int[] nums, int value){
            int i = 0;
            for(int j=0; j< nums.length; j++){
                if(nums[j] != value) {
                    nums[i] = nums[j];
                    i++;
                }
            }
            return i;
        }

        /*
              Complexity analysis

              Time complexity : O(n)
                Assume the array has a total of n elements, both i and j traverse at most 2n steps.

              Space complexity : O(1)

              Limitations:

              Consider the cases where the array contains few elements to remove. For EG., nums = [1,2,3,4,5] and value is 4. This approach will do unnecessary
              copy operation of the first four elements. Another example is nums=[4,1,2,3,5] and value is 4, It seems unnecessary to move elements 1,2,3,5.
        */


    /* Approach for efficient version
    *       When we encounter nums[i] = value, we can swap the current element out with the last element and remove last one. This reduces the arrays' size by 1.
    *       Note that the last element that was swapped in could be the value you want to remove itself.
    *       But out iteration we will still check the element and eventually removed.
    * */
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

        /*
              Complexity analysis

              Time complexity : O(n)
                Both i and n traverse at most n steps. In this approach,
                the number of assignment operations is equal to the number of elements to remove.
                So it is more efficient if elements to remove are rare.

              Space complexity : O(1)
        */

        public static void main(String[] args) {
            RemoveElementFromArray solution = new RemoveElementFromArray();
            int[] nums = {3,2,3,3,2,5,6};
            int value = 3;

//            int result  = solution.removeElementBasic(nums, value);   // unnecessary copying of elements
            int result = solution.removeElement(nums, value);       // Efficient way

            System.out.println("RESULT:" +result);
        }
    }

