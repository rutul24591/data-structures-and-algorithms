/**
 * Solution 1: Using Array (Character count array)
 * Time Complexity: O(n) where n is the length of the string
 * Space Complexity: O(1) since we're using a fixed size array (26 characters)
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
const validAnagramUsingArray = function(str1, str2){
    // If lengths are different, they can't be anagrams
    if(str1.length !== str2.length){
        return false;
    }

    // Create a character count array for lowercase English letters
    const charCount = new Array(26).fill(0);

    // Count characters in first string
    for (let i = 0; i < str1.length; i++) {
        // charCount[s.charCodeAt(i) - 'a'.charCodeAt(0)]++;
        charCount[str1.charAt(i) - 'a']++;
        charCount[str2.charAt(i) - 'a']--;
    }

    // If all counts are zero, strings are anagrams
    for (let i = 0; i < 26; i++) {
        if (charCount[i] !== 0) {
            return false;
        }
    }

    return true;
}


/**
 * Solution 2: Using HashMap
 * Time Complexity: O(n) where n is the length of the string
 * Space Complexity: O(k) where k is the number of unique characters
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
const isAnagramHashMap = (s, t) => {
    // If lengths are different, they can't be anagrams
    if (s.length !== t.length) return false;
    
    const charMap = new Map();
    
    // Count characters in first string
    for (let char of s) {
        charMap.set(char, (charMap.get(char) || 0) + 1);
    }
    
    // Check second string against the map
    for (let char of t) {
        if (!charMap.has(char)) return false;
        
        charMap.set(char, charMap.get(char) - 1);
        
        if (charMap.get(char) === 0) {
            charMap.delete(char);
        }
    }
    
    return charMap.size === 0;
}

const str1 = "anagram";
const str2 = "nagaram";
console.log(validAnagramUsingArray(str1, str2));
console.log(isAnagramHashMap(str1, str2));