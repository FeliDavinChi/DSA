# Sliding windows for replacement and coverage

The direction of the objective determines when to record a window. For a longest feasible window, shrink until the window is feasible, then record its length. For a shortest covering window, record each feasible candidate while shrinking.

## Longest window within a replacement budget

In [Longest Repeating Character Replacement](../0424-longest-repeating-character-replacement/), the minimum number of edits is the window length minus its highest character frequency. A window with four characters and a maximum count of three fits a budget of one. Maintain counts for both edges, and shrink whenever that difference exceeds `k`. With a fixed uppercase alphabet, recomputing the maximum over the 26 counts after each removal still gives linear time.

Try `"AABABBA"` with `k = 1`. The optimum is `4`, and the window `"AABA"` reaches it. With `k = 0`, a feasible window consists entirely of one repeated character.

## Shortest window covering required counts

In [Minimum Window Substring](../0076-minimum-window-substring/), store each required character’s count. As the right edge expands, mark a character satisfied when its window count reaches its required count. Once every required character is satisfied, record the current length before removing the leftmost character. Keep shrinking until a removal takes a required count below its threshold.

For source `"ABAAC"` and target `"AAC"`, the shortest window is `"AAC"`. If the target were `"AAAC"`, only the full source would work. If the source cannot meet every required count, return the empty string.
