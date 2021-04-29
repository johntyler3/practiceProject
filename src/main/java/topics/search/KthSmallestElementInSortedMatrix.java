package topics.search;

/*
Given an n x n matrix where each of the rows and columns are sorted in ascending order, return the kth smallest element in the matrix.
Note that it is the kth smallest element in the sorted order, not the kth distinct element.

Example 1:
Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
Output: 13
Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13

Example 2:
Input: matrix = [[-5]], k = 1
Output: -5
 */

import java.util.PriorityQueue;

//leetCode #378
public class KthSmallestElementInSortedMatrix {

    public int kthSmallest(int[][] matrix, int k) {

        int totalElements = (matrix.length * matrix.length) - k + 1;

        PriorityQueue<Integer> minHeap = new PriorityQueue();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                minHeap.add(matrix[i][j]);
                if (minHeap.size() > totalElements) {
                    minHeap.remove();
                }
            }
        }

        return minHeap.remove();
    }

}
