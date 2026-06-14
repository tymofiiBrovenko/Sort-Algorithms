# Bubble Sort

Bubble sort is a simple, comparison-based sorting algorithm. It repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is completely sorted.

While it is intuitive and easy to implement, it is highly inefficient for large datasets and is primarily used for educational purposes or extremely small arrays.

## Complexity

* **Time Complexity:**
  * **Worst Case:** `O(n^2)` (occurs when the array is in reverse order).
  * **Average Case:** `O(n^2)` (when the array elements are in random order).
  * **Best Case:** `O(n)` (occurs when the array is already sorted, assuming the early exit optimization is implemented).
* **Space Complexity:** `O(1)` (in-place sorting, requires no additional memory allocation).

## Implementation Notes

The included implementation features a standard optimization: a boolean flag (e.g., `swapped`) that tracks whether any elements were moved during the current iteration. If a full pass completes without any swaps, the algorithm concludes that the array is sorted and terminates early, preventing unnecessary nested loop executions.
