package com.dasun.tech.assignment.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDupAndSortUtil {

    private void removeDupAndSort(){
        List<Integer> numList = Arrays.asList(1,3,2,4,3,1,2);
        numList.stream().distinct().sorted(Collections.reverseOrder()).collect(Collectors.toList()).forEach(e-> System.out.print(e));
    }

    public static void main(String[] args) {
        RemoveDupAndSortUtil remDupObj = new RemoveDupAndSortUtil();
        remDupObj.removeDupAndSort();
    }
}
