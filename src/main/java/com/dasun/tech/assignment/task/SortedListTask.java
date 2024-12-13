package com.dasun.tech.assignment.task;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedListTask {

    private void getSortedFromAlphabeticallyOrder(){
        List<String> numList = Arrays.asList("D","B","B","F","A","D","C","E");
        numList.stream().distinct().sorted()
                .collect(Collectors.toList()).forEach(e-> System.out.print(e));
    }

    public static void main(String[] args) {
     SortedListTask sortedListTask = new SortedListTask();
     sortedListTask.getSortedFromAlphabeticallyOrder();
    }
}
