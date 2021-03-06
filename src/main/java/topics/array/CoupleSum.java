package topics.array;

/*
Given an array of integers, find two numbers such that they sum up to a specific target.
The method coupleSum should return the indices of the two numbers in the array, where index1 must be less than index2.
Please note that the indices are not zero based, and you can assume that each input has exactly one solution. Target linear runtime and space complexity.

Example:
Input Array : {2, 3, 4, 7}
Target      : 7
Output      : {2, 3}
 */

//fireCode
public class CoupleSum {

    public static int[] coupleSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (j != i && (numbers[i] + numbers[j] == target)) {
                    return new int[]{i + 1, j + 1};
                }
            }
        }
        return null;
    }

}
