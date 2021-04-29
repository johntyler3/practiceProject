package topics.design;

/*
You are given a nested list of integers nestedList. Each element is either an integer or a list whose elements may also be integers or other lists. Implement an iterator to flatten it.

Implement the NestedIterator class:
NestedIterator(List<NestedInteger> nestedList) Initializes the iterator with the nested list nestedList.
int next() Returns the next integer in the nested list.
boolean hasNext() Returns true if there are still some integers in the nested list and false otherwise.


Example 1:
Input: nestedList = [[1,1],2,[1,1]]
Output: [1,1,2,1,1]
Explanation: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,1,2,1,1].

Example 2:
Input: nestedList = [1,[4,[6]]]
Output: [1,4,6]
Explanation: By calling next repeatedly until hasNext returns false, the order of elements returned by next should be: [1,4,6].
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//leetCode #341
public class FlattenNestedListIterator {



  // This is the interface that allows for creating nested lists.
  // You should not implement it, or speculate about its implementation
  public interface NestedInteger {

     // @return true if this NestedInteger holds a single integer, rather than a nested list.
     public boolean isInteger();

      // @return the single integer that this NestedInteger holds, if it holds a single integer
     // Return null if this NestedInteger holds a nested list
     public Integer getInteger();

      // @return the nested list that this NestedInteger holds, if it holds a nested list
      // Return null if this NestedInteger holds a single integer
      public List<NestedInteger> getList();
  }

    public class NestedIterator implements Iterator<Integer> {

        private Queue<Integer> myQueue = new LinkedList<Integer>();

        public NestedIterator(List<NestedInteger> nestedList) {
            createMyQueue(nestedList);
        }

        private void createMyQueue(List<NestedInteger> nestedList) {
            for (NestedInteger n : nestedList) {
                if (n.isInteger()) {
                    myQueue.add(n.getInteger());
                } else {
                    createMyQueue(n.getList());
                }
            }
        }

        @Override
        public Integer next() {
            return myQueue.poll();
        }

        @Override
        public boolean hasNext() {
            return myQueue.size() > 0;
        }
    }

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */

}
