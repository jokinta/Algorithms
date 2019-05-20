package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        Integer arr[] = {64, 25, 76, 43, 13, 54, 21, 43, 21, 53, 23, 32, 12, 42, 45, 32,11};

        List<Integer> list = Arrays.asList(arr);
        list = sort(list);
        System.out.println(list);

     }
    public static List<Integer> sort (List<Integer> list){
        if(list.size()<=1) {
            return list;
        }
        int pivot = selectPivot(list);
        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i)<list.get(pivot)){
                less.add(list.get(i));
            }else if(list.get(i)>list.get(pivot)){
                greater.add(list.get(i));
            }
            
        }
        less = sort(less);
        greater = sort(greater);
        return concatante(less,list.get(pivot),greater);
    }
    public static List<Integer> concatante(List<Integer> less,int pivot,List<Integer> greater){
        List<Integer> result = new ArrayList<>();
        for (Integer num:less) {
            result.add(num);
        }

        result.add(pivot);

        for (Integer num:greater) {
            result.add(num);
        }
        return result;
    }

   public static int selectPivot(List<Integer> list){
        return list.size()/2;
   }
}
