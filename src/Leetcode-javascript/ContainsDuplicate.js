/**
 * @param {number[]} nums
 * @return {boolean}
 */

var containsDuplicate = function(nums) {
    let seen = new Set();
    let hasDuplicate = false;
    
    nums.forEach(num => {
        console.log(`element: `, num);
        if(seen.has(num)){
            hasDuplicate = true;
        } 
        seen.add(num);
    });
    
    return hasDuplicate;
};

const nums = [1,2,5,2,3];
console.log(containsDuplicate(nums));