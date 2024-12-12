package com.dasun.tech.assignment.duplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Remove duplicate values from text
 */
public class RemoveDuplicateUtility {

    /**
     * Remove duplicates coming from the given text
     *
     * @param text : String -> input value
     * @return : String-> unique values
     */
    private String removeDuplicates(String text){
        char dupArr[] = text.toCharArray();
        int length = dupArr.length;
        Set<Character> chSet = new HashSet<>();
        StringBuilder uniBuilder = new StringBuilder();
        for(int i = 0; i< length;i++){
            if(chSet.add(dupArr[i])){
                uniBuilder.append(dupArr[i]);
            }
        }
        return uniBuilder.toString();
    }

    public static void main(String[] args) {
        String dupText = "KANCHANA";
        RemoveDuplicateUtility removeDupObj = new RemoveDuplicateUtility();
        System.out.println("Duplicate Text :" + dupText);
        String uniqueString = removeDupObj.removeDuplicates(dupText);
        System.out.println("After Remove Dup :" + uniqueString);
    }
}
