package Leetcode.Medium._341.FlattenNestedListIterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Practice {
    public interface NestedInteger {
        boolean isInteger();
        Integer getInteger();
        List<Solution.NestedInteger> getList();
    }

    public static class NestedIterator implements Iterator<Integer> {
        Queue<Integer> res = new LinkedList<>();
        public NestedIterator(List<Solution.NestedInteger> nestedList) {
            for(Solution.NestedInteger nI: nestedList){
                iterate(nI);
            }
        }

        private void iterate(Solution.NestedInteger nestedInteger){
            if(nestedInteger.isInteger()){
                res.add(nestedInteger.getInteger());
            }
            else{
                List<Solution.NestedInteger> nestedIntegerList = nestedInteger.getList();
                for(Solution.NestedInteger nList: nestedIntegerList){
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
