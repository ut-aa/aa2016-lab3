package ee.ut.cs.aa.grading.dequeue;

import java.util.NoSuchElementException;

/**
 * Last-in-first-out collection of objects
 *
 */
public interface Stack<T> {

    /**
     * Check whether the stack is empty.
     *
     * @return true if there are no items in the stack, false otherwise
     */
    boolean isEmpty();

    /**
     * Add an item to the stack.
     *
     * @param item to be added to the stack
     */
    void push(T item);

    /**
     * Remove an item that was added last from the stack.
     *
     * @return the removed item
     * @throws NoSuchElementException if stack is empty
     */
    T pop();

    /**
     * Return an item from the stack that was added after all the other items present in the stack.
     *
     * @return "youngest" item
     * @throws NoSuchElementException if stack is empty
     */
    T peek();

}
