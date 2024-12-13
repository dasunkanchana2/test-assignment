package com.dasun.tech.assignment.sort;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class RemoveDupAndSortUtil {

    private void removeDupAndSort(){
        List<Integer> numList = Arrays.asList(1,3,2,4,3,1,2);
        numList.stream().distinct().sorted(Collections.reverseOrder())
                .collect(Collectors.toList()).forEach(e-> System.out.print(e));
    }

    private void findNumBasedOnDec(){
        List<Integer> numList = Arrays.asList(1,3,4,5,6);
        numList= numList.stream().filter(f -> f > 3).collect(Collectors.toList());
        System.out.println(numList);
    }

    private void findSecondLargestNo(){
        List<Integer> noList = Arrays.asList(10, 20, 35, 50, 50, 75, 65);
        Optional<Integer> optSecNo = noList.stream().distinct().
                sorted(Collections.reverseOrder()).
                skip(2).findFirst();
        if(optSecNo.isPresent()){
            System.out.println("Third Highest no is ::" + optSecNo.get());
        }
    }

    private void findSumOfNo(){
        List<Integer> noList = Arrays.asList(10, 20, 35, 50, 50, 75, 65);
        Integer sumOfNo = noList.stream().distinct().collect(Collectors.summingInt(Integer::intValue));
        System.out.println(sumOfNo);
    }

    private void findNoOfOccurences(){
        String text = "hello";
        Map<Character,Long> occMap = text.chars().mapToObj(c -> (char) c).
                collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        occMap.forEach((character,count)-> System.out.println("Character ::" + character + " "+ "Count ::" + count));
    }

    private void findFactorialNo(int n){
        System.out.println(LongStream.rangeClosed(1,n).reduce(1,(long x,long y) -> x*y));
    }


    private void findFibonaciNo(int n){
        List fibList = Stream.iterate(new int[]{0,1},t-> new int[] {t[1],t[0] + t[1]}).limit(n).
                map(t -> t[0]).
                collect(Collectors.toList());
        System.out.println(fibList);
    }

    private void findAnagram(String input,String target){
         boolean isAnagram =Stream.of(input.toLowerCase().split("")).sorted().collect(Collectors.joining()).
                equals(Stream.of(target.toLowerCase().split("")).sorted().collect(Collectors.joining()));
        System.out.println(isAnagram);

    }


    private void doMergeSort(){
        int arr[] = {1,3,32,5,7,2,4,6,62,8};
        int length = arr.length;
        int point = 5;
        if(point > 0 && point < length){
            int a[] = new int[point];
            int b[] = new int[length - point];
            a = Arrays.copyOfRange(arr,0,point);
            b = Arrays.copyOfRange(arr,point,length);
            IntStream.concat(Arrays.stream(a),Arrays.stream(b)).sorted().forEach(e -> System.out.println(e));
        }
    }

    private void buildBubSort(){
        int arr[] ={5,1,4,2,6,3};
        int length = arr.length;
        int temp =0;
        for(int i=0;i<length;i++){
            for(int j=1;j<length-i;j++){
                if(arr[j]> arr[j-1]){
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        Arrays.stream(arr).forEach(e -> System.out.print(e));
    }

    public static void main(String[] args) {
        RemoveDupAndSortUtil remDupObj = new RemoveDupAndSortUtil();
        remDupObj.removeDupAndSort();
        remDupObj.findSecondLargestNo();
        remDupObj.findNoOfOccurences();
        remDupObj.findSumOfNo();
        remDupObj.findFactorialNo(10);
        remDupObj.findFibonaciNo(10);
        remDupObj.findNumBasedOnDec();
        remDupObj.findAnagram("Silent","Listen");
        remDupObj.doMergeSort();
        remDupObj.buildBubSort();
    }
}
