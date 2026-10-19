# Hash lookup and set membership

Choose a set when you only need to know whether a value was seen. Use a map when the lookup also needs information such as an earlier index.

- [Contains Duplicate](../0217-contains-duplicate/) needs one membership test per value. Scan left to right and return true as soon as a value is already present. For `[4, 1, 4]`, the last `4` reveals the duplicate. For `[4]`, the scan finishes without finding one.
- [Two Sum](../0001-two-sum/) asks for indices. Before recording the current value, look up `target - value` in a map of earlier values to indices. The order matters for `[3, 3]` with target `6`, where a valid pair uses both positions. An early hit uses one recorded index and the distinct current index.
- [Longest Consecutive Sequence](../0128-longest-consecutive-sequence/) needs membership across the entire input. Start a run at `x` only when `x - 1` is absent, then count successive values while they are present. Iterate over the set of distinct values when choosing starts. The input `[4, 2, 1, 3, 2]` has a run of length `4`.

With expected constant-time hash operations, these scans take expected `O(n)` time and `O(n)` auxiliary space. The run scan stays linear because every distinct value belongs to exactly one run.
