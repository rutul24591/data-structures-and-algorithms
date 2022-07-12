package Leetcode.Easy._118.PascalTriangle;

/*      @author: Rutul Amin
        @tag; ArrayList, Array, Top Interview question
        @date: 12th July 2022.
        118. Pascal's Triangle

        Given an integer numRows, return the first numRows of Pascal's triangle.
        In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

                                                |1|
                                              |1| |1|
                                            |1| |2| |1|
                                          |1| |3| |3| |1|
                                        |1| |4| |6| |4| |1|

        Example 1:
            Input: numRows = 5
            Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

        Example 2:
            Input: numRows = 1
            Output: [[1]]

        Constraints:
            1 <= numRows <= 30

        Submission Details:
            Runtime: 1 ms, faster than 72.14% of Java online submissions for Pascal's Triangle.
            Memory Usage: 41.7 MB, less than 65.65% of Java online submissions for Pascal's Triangle.

        Time: 0(n^2)
        Space: 0(n^2)
*/
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if(numRows <= 0){
            return result;
        }
        List<Integer> trackLastRow = new ArrayList<>();
        trackLastRow.add(1);
        result.add(trackLastRow);
        // Iterate row from 1 and not from 0 as we have added 1st row to result;
        for(int row = 1; row < numRows; row++){
            //Form new list to be added to result.
            // Remember first and last element of new list in the entire traingle will always be 1.
            List<Integer> currRow = new ArrayList<>();
            //push first element
            currRow.add(1);

            // process and add the middle elements of the list where we apply pascal triangle formula.
            for(int i = 0; i < trackLastRow.size() - 1; i++){
                // Add element to current row
                int number = trackLastRow.get(i) + trackLastRow.get(i+1);
                currRow.add(number);
            }
            //push last element
            currRow.add(1);

            result.add(currRow);
            //update trackLastRow to currRow
            trackLastRow = currRow;
        }
        return result;
    }

    public static void main(String[] args){
        Solution instance = new Solution();
        int num = 5;
        List<List<Integer>> result = instance.generate(num);
        System.out.println("Result" +result);
    }
}
