# Sliding windows for uniqueness and permutations

For a contiguous substring, an entering character changes the right edge and a leaving character changes the left edge. Decide whether the window has a fixed width or grows while a condition stays true.

## Longest substring with distinct characters

In [Longest Substring Without Repeating Characters](../0003-longest-substring-without-repeating-characters/), remember each character’s last index. At right index `r`, set `left` to the greater of its current value and one past the incoming character’s previous index, if any. The current valid length is `r - left + 1`.

Trace `"abba"`. The second `b` moves `left` to index `2`. The last `a` was previously at index `0`, so it leaves `left` at `2`. The maximum is `2`. With an empty input, the maximum remains `0`.

## Permutation in a string

In [Permutation in String](../0567-permutation-in-string/), compare the pattern’s character counts with a text window of exactly the same length. When moving the window one step, decrement the departing character and increment the incoming one before testing the new counts. If the pattern is longer than the text, no full window exists.

Pattern `"aab"` appears as a permutation in `"zzaba"` because `"aba"` has two `a` characters and one `b`. Pattern `"aab"` matches no window in `"zzabb"`. With the problem’s fixed lowercase alphabet, comparing all 26 counts per window still gives linear time in the combined input length.
