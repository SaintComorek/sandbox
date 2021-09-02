# Binary Search Tree

Implement binary search tree data structure together with unit tests proving its invariants.

```java
    public interface BinarySeachTree<T> {
        /**
        * Put the node into the binary search tree
        */
        void put(T node);
        /**
        * Remove the node from the binary search tree
        */
        void remove(T node);
        /**
        * Find and return the node from the binary search tree
        */
        T find(T node);
        /**
        * Return the largest node from the binary search tree
        */
        T max();
        /**
        * Return the smallest node from the binary search tree
        */
        T min();
        /**
        * Is binary search tree empty ?
        */
        boolean isEmpty();
        /**
        * number of nodes in the binary search tree
        */
        int size();
        /**
        * Print tree in-order
        */
        void printTree();
    }
```