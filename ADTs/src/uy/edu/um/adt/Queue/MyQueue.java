package ADTs.src.uy.edu.um.adt.Queue;

import ADTs.src.uy.edu.um.adt.exceptions.EmptyQueueException;

public interface MyQueue<T> {

    void enqueue(T value);

    T dequeue() throws EmptyQueueException;

    boolean contains(T value);

    T first();

    int size();

}
