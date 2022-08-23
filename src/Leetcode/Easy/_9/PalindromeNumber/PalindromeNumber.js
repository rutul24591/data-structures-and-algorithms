const findPalindrome = (num) => {
    if(num < 0){
        return false;
    }
    let result = 0;
    let check = num;

    while(check > 0){
        result = result * 10 + check % 10;
        check = Math.floor(check / 10);
    }
    return result == num;
}

const result = findPalindrome(121);
const result2 = findPalindrome(-121);
const result3 = findPalindrome(123);

console.log("Result: ", result);
console.log("Result2: ", result2);
console.log("Result3: ", result3);