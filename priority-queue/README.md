# Priority Queue

Implement priority queue data structure together with unit tests proving its invariants.
You can implement it using either binary min-heap or binary max-heap (you can even
implement both versions if you want).

## Implement max priority queue from scratch
```java
    public interface MaxPriorityQueue {
        /**
        * Insert an item into the priority queue
        */
        void insert(T item);
        /**
        * Return the largest item
        */
        T max();
        /**
        * Return and remove the largest item
        */
        T delMax();
        /**
        * Is the priority queue empty ?
        */
        boolean isEmpty();
        /**
        * number of items in the priority queue
        */
        int size();
    }
```
## Implement min priority queue from scratch
```java
    public interface MinPriorityQueue {
        /**
        * Insert an item into the priority queue
        */
        void insert(T item);
        /**
        * Return the smallest item
        */
        T min();
        /**
        * Return and remove the smallest item
        */
        T delMin();
        /**
        * Is the priority queue empty ?
        */
        boolean isEmpty();
        /**
        * number of items in the priority queue
        */
        int size();
    }
```