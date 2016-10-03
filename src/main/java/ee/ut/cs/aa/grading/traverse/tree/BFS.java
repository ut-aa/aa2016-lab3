package ee.ut.cs.aa.grading.traverse.tree;

import ee.ut.cs.aa.grading.tree.BinaryTreeVertex;

import java.util.List;

/**
 * Tree traversal in breadth first order.
 */
public interface BFS<T> {

    /**
     * Traverse the tree in breadth first order.
     *
     * @param root of the tree that will be traversed
     * @return List of values, in order of traversal
     */
    List<T> breathFirstSearch(BinaryTreeVertex<T> root);

}
