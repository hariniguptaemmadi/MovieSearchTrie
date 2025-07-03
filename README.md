## 🎬 MovieSearchTrie — Java Trie-Based Autocomplete Engine

Java project implementing a Trie (prefix tree) to provide fast autocomplete suggestions for movie titles, with frequency-based ranking, delete support, and performance metrics.

---

## Features

1) Trie-based insert, search, and prefix autocomplete
2) Frequency tracking to rank suggestions by usage
3) Dynamic delete of movie titles from the Trie
4) Custom sorting: frequency descending, then alphabetically
5) Performance metrics: measures time for insertions and search
6) Scalable design — easily supports hundreds or thousands of titles

----

## How it works

1) Loads movie titles into a Trie (from code or file)
2) Prompts the user to enter a prefix
3) Suggests movie titles matching the prefix, ranked by frequency
4) Measures and displays time taken for insert/search
5) Allows dynamic extension — new titles can be added or deleted

----

## How to Run

  1) Compile:
  javac MovieSearchTrie.java Trie.java TrieNode.java

  2) Run:
  java MovieSearchTrie
  
---

## Possible Enhancements

1) Load movie titles from a large dataset file (e.g. IMDb export
2) Add compressed Trie (Radix Tree) for memory optimization
3) Build a simple GUI using Swing or JavaFX
4) Add fuzzy matching (e.g. Levenshtein distance) for typo tolerance

----

## Tech Stack

-Java 8+

-Core Java Collections (Map, List, etc.)

-File I/O (BufferedReader, FileReader)

---

## Author
  -Harini Emmadi
  
  -harini14738@gmail.com
  

