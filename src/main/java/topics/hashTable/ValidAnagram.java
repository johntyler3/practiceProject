package topics.hashTable;

/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 */

//leetCode 242
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] characters = new int[256];

        for (char c : s.toCharArray()) {
            characters[c]++;
        }
        for (char c : t.toCharArray()) {
            characters[c]--;
        }

        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != 0) {
                return false;
            }
        }

        return true;
    }
}
