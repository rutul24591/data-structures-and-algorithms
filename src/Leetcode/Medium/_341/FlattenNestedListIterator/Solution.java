package Leetcode.Medium._341.FlattenNestedListIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
        @author: Rutul Amin
        @tag: Queues, Arrays
        @date: 18th July 2022

        341. Flatten Nested List Iterator

        You are given a nested list of integers nestedList.
        Each element is either an integer or a list whose elements may also be integers or other lists.
        Implement an iterator to flatten it.

        Implement the NestedIterator class:
        NestedIterator(List<NestedInteger> nestedList) Initializes the iterator with the nested list nestedList.
        int next() Returns the next integer in the nested list.
        boolean hasNext() Returns true if there are still some integers in the nested list and false otherwise.

        Your code will be tested with the following pseudocode:
            initialize iterator with nestedList
            res = []
            while iterator.hasNext()
                append iterator.next() to the end of res
            return res
            If res matches the expected flattened list, then your code will be judged as correct.

        Example 1:
            Input: nestedList = [[1,1],2,[1,1]]
            Output: [1,1,2,1,1]
            Explanation: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].

        Example 2:
            Input: nestedList = [1,[4,[6]]]
            Output: [1,4,6]
            Explanation: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].


        Constraints:
            1 <= nestedList.length <= 500
            The values of the integers in the nested list is in the range [-106, 106].

        Submission Details:
            Runtime: 4 ms, faster than 75.40% of Java online submissions for Flatten Nested List Iterator.
            Memory Usage: 47.1 MB, less than 17.18% of Java online submissions for Flatten Nested List Iterator.
*/
public class Solution {
     /**
     * This is the interface that allows for creating nested lists.
     * You should not implement it, or speculate about its implementation
     */

    public interface NestedInteger {
        boolean isInteger();
        Integer getInteger();
        List<NestedInteger> getList();
    }

    public static class NestedIterator implements Iterator<Integer> {
        Queue<Integer> res = new LinkedList<>();
        public NestedIterator(List<NestedInteger> nestedList) {
            for(NestedInteger nI: nestedList){
                iterate(nI);
            }
        }

        private void iterate(NestedInteger nestedInteger){
            if(nestedInteger.isInteger()){
                res.add(nestedInteger.getInteger());
            }
            else{
                List<NestedInteger> nestedIntegerList = nestedInteger.getList();
                for(NestedInteger nList: nestedIntegerList){
                    iterate(nList);
                }
            }
        }

        @Override
        public Integer next() {
            return res.poll();
        }

        @Override
        public boolean hasNext() {
            return !res.isEmpty();
        }
    }

/*
  Your NestedIterator object will be instantiated and called as such:
  NestedIterator i = new NestedIterator(nestedList);
  while (i.hasNext()) v[f()] = i.next();
 */
}
