package ee.ut.cs.aa.grading.traverse.tree;

import ee.ut.cs.aa.grading.tree.BinaryTreeVertex;

import java.util.List;

/**
 * Tree traversal in depth first order.
 */
public interface DFS<T> {

    /**
     * Traverse the tree in depth first order.
     *
     * @param root node of the tree
     * @return List of values, in order of traversal
     */
    List<T> depthFirstSearch(BinaryTreeVertex<T> root);

}
