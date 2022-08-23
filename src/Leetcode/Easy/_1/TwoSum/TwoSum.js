/** TIME: O(n^2) SPACE: 0(n) */
const twoSum = (array, target) => {
    let indexes = [];
    for(let i = 0; i < array.length; i++){
        for(let j = i + 1; j < array.length; j++){
            if(array[i] + array[j] == target){
                indexes[0] = i; // indexes.push(i);
                indexes[1] = j; // indexes.push(j);
            }
        }
    }

    return indexes;
}

/** TIME: O(n) SPACE: 0(n) */
const twoSum2 = (array, target) => {
    let indexes = [];
    let map = new Map();

    for(let index = 0; index < array.length; index++){
        if(map.has(target - array[index])){
            indexes[1] = index; // Can use indexes.push
            indexes[0] = map.get(target - array[index]);
        }else{
            map.set(array[index], index);
        }
    }

    return indexes;
}

let arr = [2,7,9,15];
const target = 16;

const result = twoSum2(arr, target);
console.log("Result: ", result);