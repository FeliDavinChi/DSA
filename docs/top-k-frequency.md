# Selecting the most frequent values

In [Top K Frequent Elements](../0347-top-k-frequent-elements/), first count how often each distinct value appears. Let `n` be the input length, `m` the distinct value count, and `k` the requested number of values. Selection runs over the `m` count entries.

## Keep the best k entries in a heap

Use a min-heap ordered by frequency. Insert each distinct entry and remove the smallest if the heap grows past `k`. After each insertion and possible removal, the heap contains the `k` largest frequencies seen so far, or all entries when fewer than `k` have been processed. Counting plus selection takes expected `O(n + m log(k + 1))` time and `O(m + k)` auxiliary space.

## Visit frequency buckets in descending order

Because no frequency exceeds `n`, index buckets by frequency, put each distinct value in the bucket for its count, and scan from `n` down until `k` values have been collected. This takes expected `O(n)` time and `O(n + m)` auxiliary space including the counts. Heap selection avoids allocating a bucket slot for every possible count.

For `[4, 4, 4, 7, 7, 9]` with `k = 2`, expect `4` and `7` in any order. With `k = 1`, expect only `4`, even though it occurs three times. With `k = m`, every distinct value appears exactly once in the result.
