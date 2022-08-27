package Leetcode.Easy._70.ClimbingStairs;

public class Practice {
    public int climbStairs(int n) {
        if(n == 1) {
            return 1;
        }
        int way1 = 1;
        int way2 = 2;

        int result = way2;

        for(int i = 2; i < n; i++){
            result = way1 + way2;
            way1 = way2;
            way2 = result;
        }

        return result;
    }

    public static void main(String[] args){
        int x = 4;
        Practice instance = new Practice();
        int result = instance.climbStairs(x);
        System.out.println("RESULT: " +result);
    }
}
