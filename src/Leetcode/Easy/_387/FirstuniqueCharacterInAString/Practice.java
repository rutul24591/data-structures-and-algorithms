package Leetcode.Easy._387.FirstuniqueCharacterInAString;

public class Practice {
    public int firstUniqChar(String s) {
        /* Array of length 26 to store occurrence of each letter */
        int[] freq = new int[26];

        /* Let's say c='a' then it will increase value of 0 index by 1 */
        for(char c : s.toCharArray()){
            freq[c - 'a']++;
            //freq[c - 'a'] = freq[c - 'a'] + 1;
        }

        for(int i = 0; i < s.length(); i++){
            int ch = s.charAt(i) - 'a';
            /* Check the first letter of string whose occurrence is 1.  */
            if(freq[ch] == 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        String s = "loveleetcode";
        Solution instance = new Solution();
        int result = instance.firstUniqChar(s);
        System.out.println("Result: "+result);
    }
}
