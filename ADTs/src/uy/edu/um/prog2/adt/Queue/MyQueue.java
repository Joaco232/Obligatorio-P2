package uy.edu.um.prog2.adt.Queue;

import uy.edu.um.prog2.adt.exceptions.EmptyQueueException;

public interface MyQueue<T> {

    void enqueue(T value);

    T dequeue() throws EmptyQueueException;

    boolean contains(T value);

    T first();

    int size();

}
