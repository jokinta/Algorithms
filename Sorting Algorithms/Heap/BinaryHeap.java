package com.company.Heap;

import java.util.ArrayList;

public class BinaryHeap <T extends Comparable<T>> implements BinaryHeapBase<T> {
    private final ArrayList<T> values;
    BinaryHeap(){
        values = new ArrayList<>();
    }
    @Override
    public void push(T value) {
        values.add(value);
        heapiFyUp();

    }

    private void heapiFyUp(){
        int index = values.size()-1;
        while (index>1){
            int parentIndex = index/2;
            T parentValue = values.get(parentIndex);
            T value = values.get(index);
            if(value.compareTo(parentValue)<0){
                swap(index,parentIndex);
                index=parentIndex;
            }else {
                break;
            }
        }
    }

    private void swap(int i, int j) {
        T value = values.get(i);
        values.set(i,values.get(j));
        values.set(j,value);
    }

    @Override
    public T getTop() {
        return values.get(1);
    }

    @Override
    public T pop() {
        T valueToReturn = getTop();
        T value = values.get(values.size()-1);
        values.set(1,value);
        values.remove(values.size()-1);
        heapiFyDown();
        

        return valueToReturn;
    }

    private void heapiFyDown() {
        int index = 1;
        while (true){
            int leftChildIndex = index*2;
            int rightChildIndex = index*2+1;
            int bestIndex = leftChildIndex;
            if(leftChildIndex >=values.size()){
                break;
            }
            if(rightChildIndex>=values.size()){
                break;
            }
            if(bestIndex<0){
                break;
            }
            T bestValue = values.get(leftChildIndex);
            T value = values.get(index);
            if(bestValue.compareTo(values.get(rightChildIndex))>0){
                    bestIndex = rightChildIndex;
                    bestValue = values.get(rightChildIndex);
            }
            if(value.compareTo(bestValue)>0){
                swap(index,bestIndex);
                index = bestIndex;
            }else {
                break;
            }
        }
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}
