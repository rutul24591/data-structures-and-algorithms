const defangIp = (ipStr) => {
    console.log("String:", ipStr);
    return ipStr.split('.').join('[.]');

    //return address.replaceAll('.', '[.]'); also works
    //return address.replace(".","[.]");  also works in java
}

const str = '1.1.1.1';
const result = defangIp(str);
console.log("result: ", result);