package Leetcode.Easy._860.LemonadeChange;

public class Practice {
    public boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for(int bill : bills){
            if(bill == 5){
                five++;
            }else if(bill == 10){
                if(five == 0){
                    return false;
                }
                five--;
                ten++;
            }else{
                if(five > 0 && ten > 0){
                    five--;
                    ten--;
                }else if(five >= 3){
                    five = five - 3;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] nums = {5,5,10,5,20};
        int[] nums2 = {5,5,10,10,20};

        Solution instance = new Solution();
        boolean result = instance.lemonadeChange(nums);
        boolean result2 = instance.lemonadeChange(nums2);
        System.out.println("Result: " +result);
        System.out.println("Result2: " +result2);
    }
}
