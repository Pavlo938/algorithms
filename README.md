# algorithms

## Description 
Training project for implementing and comparing different type of algorithms. 

| Performance | Merge sort | Insertion sort |
|---|---|---|
| worst-case | O(n\*log n) | O(n^2) |
| average-case| O(n\*log n) | O(n^2) |
| Best-case| O(n\*log n) | O(n) |

####Merge sort

Algorithm based on divide and conquer strategy, elements are split into two sub-arrays until one element is left
and then merges these elements into one sorted array.

- Uses more memory when creating new arrays(divided and merged).
- In the case of a partially sorted array, the number of operations and memory is not reduced.
- Works better on large arrays than *Insertion sort*.
- Cannot dynamically add new elements to the array during sorting.

####Insertion sort

Sorting algorithm in which elements are taken from an unsorted item, inserting it in sorted order in front of the other
items, and repeating until all items are in order. 

- In the case of a partially sorted array, the number of nested iterations is reduced.
- Uses less memory then *Merge sort*.
- Can dynamically add new elements to the array during sorting.
- Poor performance on large arrays.  