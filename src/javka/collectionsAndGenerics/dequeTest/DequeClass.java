package javka.collectionsAndGenerics.dequeTest;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Created by Nazar on 11.03.2015.
 */
public class DequeClass<T> implements Iterable<T>{

    private List<T> list = new LinkedList<>();      // main list
    private List<T> inQueue = new LinkedList<>();
    private List<Integer> inQueueInfo = new LinkedList<>();
    private int capacity;

    // Standard constructor
    public DequeClass() {
    }

    // Constructor with capacity
    public DequeClass(int capacity) {
        this.capacity = capacity;
    }

    // ----------------------------------------------------------------
    // Adding

    public void add(T t) {

    }
    public void addFirst(T t){
        if (capacity != 0 && list.size() == capacity) {

            try {
                throw new IllegalStateException();
            } catch (IllegalStateException e) {
                throw new IllegalStateException("Deque full");
            }
        }
        list.add(0, t);
    }

    public void addLast(T t){
        if (capacity != 0 && list.size() == capacity) {

            try {
                throw new IllegalStateException();
            } catch (IllegalStateException e) {
                throw new IllegalStateException("Deque full");
            }
        }
        list.add(t);
    }

    public void offer(T t) {
        if (list.size() == capacity) {
            inQueue.add(t);
            inQueueInfo.add(1);  // 1 means that the element will be added
                                 // to the END while removing element, thus making some space
        }
        else list.add(t);
    }
    public void offerFirst(T t) {
        if (list.size() == capacity){
            inQueue.add(t);
            inQueueInfo.add(0); // 0 means that the element will be added
                                // to the BEGINNING while removing elements, thus making some space
        }
        else list.add(0, t);

    }

    public void offerLast(T t) {
        if (list.size() == capacity) {
            inQueue.add(t);
            inQueueInfo.add(1); // 1 means that the element will be added
                                // to the END while removing element, thus making some space
        }
        else list.add(t);
    }
    // -------------------------------------------------------


    // Removing
    public void removeFirst() {
        if (list.size() == 0) throw new NoSuchElementException();

        list.remove(0);

        processQueue();
    }

    public void removeLast() {
        if (list.size() == 0) throw new NoSuchElementException();

        list.remove(list.size() - 1);

        processQueue();
    }
    // -------------------------------------------------------

    // Retrieving
    public T getFirst() {
        if (list.size() == 0) throw new IndexOutOfBoundsException("Index: 0, Size: 0");
        return list.get(0);
    }

    public T getLast() {
        if (list.size() == 0) throw new IndexOutOfBoundsException("Index: 0, Size: 0");
        return list.get(list.size() - 1);
    }
    // --------------------------------------------------------


    // Iterator
    private class DequeClassIterator implements Iterator<T> {

        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public T next() {
            return list.get(index++);
        }

        @Override
        public void remove() {
            list.remove(index);
        }
    }
    @Override
    public Iterator iterator() {
        return new DequeClassIterator();
    }
    // --------------------------------------------------------

    private void processQueue() {
        if (inQueue.size() > 0) {       // adding an element to the list and removing it from queue
            if (inQueueInfo.get(0) == 0){
                list.add(inQueue.remove(0));
                inQueueInfo.remove(0);
            }
            else if (inQueueInfo.get(0) == 1) {
                list.add(inQueue.remove(0));
                inQueueInfo.remove(0);
            }
        }
    }
}
