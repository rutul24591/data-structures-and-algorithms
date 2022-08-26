const parenthesisObject = {
    '{' : '}',
    '(' : ')',
    '[' : ']'
}

const isValid = (str) => {
    if(str.length % 2 == 1){
        return false;
    }
    let stack = [];
    for(let i in str){
        if(parenthesisObject[str[i]]){
            stack.push(parenthesisObject['{']);
        }else{
            if(stack.length == 0 || stack.pop() != str[i]){
                return false;
            }
        }
        console.log("stack:", stack);
    }


    return stack.length == 0 ? true : false;
}

const str = '{}([])';
const result = isValid(str);
console.log("Result: ", result);