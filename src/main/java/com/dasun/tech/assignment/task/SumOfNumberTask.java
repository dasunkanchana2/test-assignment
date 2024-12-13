package com.dasun.tech.assignment.task;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfNumberTask {

    private Integer getSumOfNumbers(){
        List<Integer> noList = Arrays.asList(10, 20, 35, 50, 50, 75, 65);
        return noList.stream().distinct().collect(Collectors.summingInt(Integer::intValue));
    }
    public static void main(String[] args) {
        SumOfNumberTask sumOfNumberTask = new SumOfNumberTask();
        int sumOfNumbers = sumOfNumberTask.getSumOfNumbers();
        System.out.println("Sum of Numbers in the array :::" + sumOfNumbers);
    }
}
