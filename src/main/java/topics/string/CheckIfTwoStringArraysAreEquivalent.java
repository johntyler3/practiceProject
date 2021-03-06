package topics.string;

/*
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string.

Example 1:
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.

Example 2:
Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false

Example 3:
Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true
 */

//leetCode #1662
public class CheckIfTwoStringArraysAreEquivalent {

    //this approach uses some memory with the string builders and time for concatenation
    //there is a better approach using loops and pointers to compare

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder sb1 = new StringBuilder();
        for (String s : word1)  {
            sb1.append(s);
        }

        StringBuilder sb2 = new StringBuilder();
        for (String s : word2) {
            sb2.append(s);
        }

        return sb1.toString().equals(sb2.toString());

    }

}
