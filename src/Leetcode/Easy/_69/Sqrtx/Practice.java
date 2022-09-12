package Leetcode.Easy._69.Sqrtx;

public class Practice {
    public int findRoot(int num){
        //Edge cases
        if(num == 0 || num == 1){
            return num;
        }
        /* Perform Binary search */
        long start = 1;
        long end = num;
        while(start <= end){
            /*
                  To calculate mid 'left + right' may cause the Integer Overflow, meaning that left+right > 2147483647
                  To avoid overflow we use this instead of left + right / 2;
            */
            long mid = start + (end-start)/2;

            if(mid * mid == num){
                return (int) mid;
            }else if(mid * mid < num){
                start = (int) mid + 1;
            }else{
                end = (int) mid - 1;
            }
        }
        return (int)end;
    }

    public static void main(String[] args){
        int x = 16, y = 26;
        SquareRoot instance = new SquareRoot();
        int result1 = instance.findRoot(x);
        int result2 = instance.findRoot(y);
        System.out.println("square root of 16: " +result1);
        System.out.println("square root of 26: " +result2);
    }
}
