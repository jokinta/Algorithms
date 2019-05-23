package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MargeSort {
    public static void main(String[] args) {
        Integer arr[] = {64, 25, 76, 43, 13, 54, 21, 43, 21, 53, 23, 32, 12, 42, 45, 32,11};

        List<Integer> list = Arrays.asList(arr);
        list = sort(list);
        System.out.println(list);
    }

    private static List<Integer> sort(List<Integer> list) {
        if(list.size()<=1){
            return list;

        }
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 0, mid = list.size()/2; i < list.size(); i++) {
            if(i < mid){
                    left.add(list.get(i));
            }
            if(i > mid){
                    right.add(list.get(i));
            }

        }
        left = sort(left);
        right = sort(right);
        return marge(left,right);
    }
    private static List<Integer> marge (List<Integer> left,List<Integer> right){
        List<Integer> result = new ArrayList<>();
        while (left.size()>0 || right.size()>0){
            if(left.size()>0 && right.size()>0) {
                if (left.get(0) < right.get(0)) {
                    result.add(left.remove(0));
                } else {
                    result.add(right.remove(0));
                }
            }else if(left.size()>0){
                result.add(left.remove(0));
            }else if (right.size()>0){
                result.add(right.remove(0));
            }
        }
        return result;
    }
}
