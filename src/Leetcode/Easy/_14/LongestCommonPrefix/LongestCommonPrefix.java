package Leetcode.Easy._14.LongestCommonPrefix;

/*

     14. Longest Common Prefix.

        Write a function to find the longest common prefix string amongst an array of strings.
        If there is no common prefix, return an empty string "".

        Example 1:

            Input: strs = ["flower","flow","flight"]
            Output: "fl"

        Example 2:

            Input: strs = ["dog","racecar","car"]
            Output: ""
            Explanation: There is no common prefix among the input strings.

        Constraints:

        1 <= strs.length <= 200
        0 <= strs[i].length <= 200
        strs[i] consists of only lowercase English letters.
*/

public class LongestCommonPrefix {
    public String LongestPrefix(String[] strs) {

        /* Check if array is null or its length is 0. */
        if(strs == null || strs.length == 0){
            return "";
        }
        /* Check if length of array is 1, then we return the only(zeroth) item. */
        if(strs.length == 1){
            return strs[0];
        }
        /* Store the very first item in previous variable */
        String previous = strs[0];

        for(int i = 1; i < strs.length; i++){
            /* IndexOf checks the string and returns the index of first letter of provided substring(or any string). If not found it returns -1.  */
            while(strs[i].indexOf(previous) != 0){  // It will result in -1 until previous matches the substring of strs[i].
                /* Cut and reduce the size of previous from end. For Eg. if previous = "flower"  then it would result in "flowe".
                If not matches are found then previous would result in empty string "", which we return. */
                previous = previous.substring(0, previous.length() - 1);
            }
        }
        return previous;
    }

    public static void main(String[] args){
        String[] strs = {"flower", "flow", "flight", "flush"};
        LongestCommonPrefix instance = new LongestCommonPrefix();
        String result = instance.LongestPrefix(strs);
        System.out.println("Result: "+result);
    }
}
