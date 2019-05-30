package com.company.Heap;

public interface BinaryHeapBase<T> extends Comparable <T> {
    void push(T value);
    T getTop();
    T pop();
    int size();
}
