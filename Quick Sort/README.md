# Quick Sort

Quick Sort is a highly efficient, comparison-based sorting algorithm that utilizes a divide-and-conquer strategy. It works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively.

Due to its efficient memory use and excellent average-case performance, it is generally faster in practice than other `O(n log n)` algorithms like Merge Sort, making it a standard choice for underlying sorting engines in many programming languages.

## Complexity

* **Time Complexity:**
  * **Average / Best Case:** `O(n log n)` (occurs when the partition process divides the array into two roughly equal halves).
  * **Worst Case:** `O(n^2)` (occurs when the partition is highly unbalanced, e.g., the smallest or largest element is consistently chosen as the pivot).
* **Space Complexity:** `O(log n)` (due to the recursive call stack). The sorting itself is done in-place, requiring no additional array allocations.

## Implementation Notes

This repository includes a clean, in-place implementation of Quick Sort written in Java. 
* **Partition Scheme:** The implementation uses the Lomuto partition scheme, choosing the last element as the pivot for simplicity and readability.
* **Optimization Considerations:** To prevent the worst-case `O(n^2)` scenario on already sorted (or reverse-sorted) arrays, the algorithm can be upgraded by implementing a "median-of-three" pivot selection or by choosing a randomized pivot.
