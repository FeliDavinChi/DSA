# Counting, grouping, and scoped duplicates

Anagram problems use multiplicity to decide which strings match. A fixed-size letter count represents that multiplicity for a known alphabet. Sorting the letters also gives a canonical representation.

- [Valid Anagram](../0242-valid-anagram/) compares the counts of two strings. Count letters from the first string and subtract the letters in the second. Every count must end at zero. The pair `"aab"` and `"abb"` is a useful check because both strings have the same length and letter set.
- [Group Anagrams](../0049-group-anagrams/) computes a key for each string and appends the original string to that key’s group. Keep count-vector entries distinct in the key, for example with delimiters between decimal counts. With a sorted key, `"eat"`, `"tea"`, and `"ate"` share `"aet"`. Two empty strings share the empty key and both belong in that group.
- [Valid Sudoku](../0036-valid-sudoku/) checks uniqueness within each row, column, and 3×3 box. Keep a separate set per scope and skip empty cells marked with `'.'`. Using zero-based coordinates, the box index is `(row / 3) * 3 + col / 3` with integer division. Equal digits at `(0, 0)` and `(1, 1)` violate the box rule even though their rows and columns differ.

While tracing a Sudoku board, annotate the row, column, and box indices beside each filled cell. Each digit insertion should affect one set for each of those three scopes.
