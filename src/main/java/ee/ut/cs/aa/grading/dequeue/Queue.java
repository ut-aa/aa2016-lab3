package ee.ut.cs.aa.grading.dequeue;

import java.util.NoSuchElementException;

/**
 * Last-in-last-out (first-in-first-out) collection of objects
 */
public interface Queue<T> {

    /**
     * Check whether the queue is empty.
     *
     * @return true if there are no items in the queue, false otherwise
     */
    boolean isEmpty();

    /**
     * Add item to the queue.
     *
     * @param item to be added
     */
    void add(T item);

    /**
     * Remove an item from the queue that was added before all the other items currently in the queue.
     *
     * @return the removed item
     * @throws NoSuchElementException if queue is empty
     */
    T remove() throws NoSuchElementException;

    /**
     * Return an item from the queue that was added before all the other items currently
     * in the queue without removing it.
     *
     * @return "oldest" item
     * @throws NoSuchElementException if queue is empty
     */
    T peek() throws NoSuchElementException;

}
