package ee.ut.cs.aa.grading.selfOrganizing;

import java.util.NoSuchElementException;

/**
 * Self-organizing list based map implementation.
 *
 * @param <Key>
 * @param <Value>
 */
public interface SelfOrganizingListMap<Key, Value> {

    /**
     * Adds key-value pair to the map. If map already contains
     * the given key then the corresponding value is updated to be the new value.
     * @param key
     * @param value
     */
    void add(Key key, Value value);


    /**
     * Return value corresponding to the key and reorganize list.
     * @param key
     * @return value corresponding to key
     * @throws NoSuchElementException if key is not present
     */
    Value get(Key key);


    /**
     * Removes value key-value pair from the map.
     * @param key
     * @return Removed value.
     * @throws NoSuchElementException if key is not present
     */
    Value remove(Key key) throws NoSuchElementException;


    /**
     * True if map is empty and false otherwise.
     * @return
     */
    boolean isEmpty();


    /**
     * Checks if map contains given key value.
     * (also list is reorganized)
     * @param key
     * @return true if contain key and false otherwise.
     */
    boolean contains(Key key);

}