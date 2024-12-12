package com.dasun.tech.assignment.reverse;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * @author dasun
 * Reverse Given Text
 */
public class ReverseTextUtility {
    /**
     * This method responsible to reserve given text
     *
     * @param baseText : String : Input text
     * @return : String -> Reversed Value
     */
    private String reverseText(String baseText) {
        char arr[] = baseText.toCharArray();
        int length = arr.length;
        char temp;

        for (int i = 0; i < length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[length - i - 1];
            arr[length - i - 1] = temp;
        }
        String rev[] = String.valueOf(arr).split("");
        return Arrays.asList(rev).stream().collect(Collectors.joining(","));
    }

    public static void main(String[] args) {
        String baseText = "ABBA";
        ReverseTextUtility reverseTextObj = new ReverseTextUtility();
        System.out.println("Before Reverse the Text :" + baseText);
        String reversedText = reverseTextObj.reverseText(baseText);
        System.out.println("After Reverse the Text :" + reversedText);
    }
}
