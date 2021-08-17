1. Propose Sorter interface. Its implementations must support various sorting algorithms. Sorter must return copy of given collection with its items sorted by either natural ordering in case of Comparable items or by provided Comparator.
2. Implement unit tests. Tests must cover sorting of both Comparable objects and sorting of some example uncomparable POJO.
3. Implement at least 3 of following sorting algorithms
     - selection sort
     - insertion sort
     - shellsort
     - quicksort
     - mergesort
4. Compare effectivnes of implemented sorting algorithms on various inputs. You can use [Java Microbenchmark Harness](https://github.com/openjdk/jmh). Test these types of inputs
    - collection with small number of items
    - collection with large number of items
    - collection with large number of items partialy sorted
    - collection with large number of items sorted
    
