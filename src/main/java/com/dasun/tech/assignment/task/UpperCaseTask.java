package com.dasun.tech.assignment.task;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class UpperCaseTask {

    private void getFirstUpperCaseLetter(){
        String text = "NewZealand";
        char arr[] = text.toCharArray();
        List<String> listOfLetters = Arrays.asList(String.valueOf(arr).split(""));
        Optional<String> optLetter = listOfLetters.stream().
                skip(0).findFirst();
        if(optLetter.isPresent()){
            System.out.println("First value of letter is capital ::" + Character.isUpperCase(optLetter.get().charAt(0)));
        }
    }



    public static void main(String[] args) {
        UpperCaseTask upperCaseTask = new UpperCaseTask();
        upperCaseTask.getFirstUpperCaseLetter();
    }
}
