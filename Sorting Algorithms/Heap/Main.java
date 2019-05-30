package com.company.Heap;

public class Main {
    public static void main(String[] args) {
        BinaryHeap<Integer> heap = new BinaryHeap<>();
        heap.push(5);
        heap.push(4);
        heap.push(3);
        heap.push(1);
        System.out.println(heap.getTop());
        heap.pop();
        System.out.println(heap.getTop());

    }
}
