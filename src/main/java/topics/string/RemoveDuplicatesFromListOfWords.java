package topics.string;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
Given a List of Strings, write a method removeDuplicates that removes duplicate words from the List and returns an
ArrayList of all the unique words. The returned ArrayList should be lexically alphabetically.

Input: [Hi, Hello, Hey, Hi, Hello, Hey]
Output: [Hello, Hey, Hi]
 */

//fireCode
public class RemoveDuplicatesFromListOfWords {

    public static ArrayList<String> removeDuplicates(List<String> input) {

        Set uniqueWords = new TreeSet<String>();
        for (String s : input) {
            uniqueWords.add(s);
        }

        ArrayList returnList = new ArrayList<String> (uniqueWords);
        return returnList;
    }

}
