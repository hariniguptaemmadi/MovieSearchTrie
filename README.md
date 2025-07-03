🎬 MovieSearchTrie — Java Trie-Based Autocomplete Engine

Java project implementing a Trie (prefix tree) to provide fast autocomplete suggestions for movie titles, with frequency-based ranking, delete support, and performance metrics.
---

- Features

✅ Trie-based insert, search, and prefix autocomplete
✅ Frequency tracking to rank suggestions by usage
✅ Dynamic delete of movie titles from the Trie
✅ Custom sorting: frequency descending, then alphabetically
✅ Performance metrics: measures time for insertions and search
✅ Scalable design — easily supports hundreds or thousands of titles
---

- How it works

Loads movie titles into a Trie (from code or file)
Prompts the user to enter a prefix
Suggests movie titles matching the prefix, ranked by frequency
Measures and displays time taken for insert/search
Allows dynamic extension — new titles can be added or deleted
----

- How to Run

  1)Compile:
  javac MovieSearchTrie.java Trie.java TrieNode.java

  2)Run:
  java MovieSearchTrie
---

- Possible Enhancements

Load movie titles from a large dataset file (e.g. IMDb export)
Add compressed Trie (Radix Tree) for memory optimization
Build a simple GUI using Swing or JavaFX
Add fuzzy matching (e.g. Levenshtein distance) for typo tolerance
----

- Tech Stack

Java 8+
Core Java Collections (Map, List, etc.)
File I/O (BufferedReader, FileReader)
---

- Author
  Harini Emmadi
  harini14738@gmail.com
  

