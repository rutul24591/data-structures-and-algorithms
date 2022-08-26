const sortedSquares = (nums) => {
    let low = 0,
        high = nums.length - 1;

    let squaresResult = [nums.length];

    for(let index = nums.length - 1; index >= 0; index--){
        if(Math.abs(nums[low]) > Math.abs(nums[high])){
            squaresResult[index] = nums[low] * nums[low];
            low = low + 1;
        }else{
            squaresResult[index] = nums[high] * nums[high];
            high = high - 1;
        }
    }
    return squaresResult;
}

const nums = [-4,-2,-1,0,2,3,12,16];
const result = sortedSquares(nums);
console.log("result:", result);