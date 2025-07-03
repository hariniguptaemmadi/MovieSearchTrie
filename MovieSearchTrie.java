// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.*;
import java.io.*;

public class MovieSearchTrie {
    public static void main(String[] args) {
        Trie trie = new Trie();
        List<String> movies = loadMoviesFromFile("movie_titles.txt");

        if (movies.isEmpty()) {
            System.out.println("No movies loaded. Please check your movie_titles.txt file.");
            return;
        }

        long insertStart = System.nanoTime();
        for (String movie : movies) {
            trie.insert(movie.toLowerCase());
        }
        long insertEnd = System.nanoTime();
        System.out.printf("Inserted %d titles in %.3f ms%n", movies.size(), (insertEnd - insertStart) / 1_000_000.0);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter prefix (or type 'exit' to quit): ");
            String prefix = scanner.nextLine().toLowerCase();

            if (prefix.equals("exit")) break;

            long searchStart = System.nanoTime();
            List<String> suggestions = trie.getWordsWithPrefix(prefix);
            long searchEnd = System.nanoTime();

            if (suggestions.isEmpty()) {
                System.out.println("No suggestions found.");
            } else {
                System.out.printf("Suggestions (%d found in %.3f ms):%n", suggestions.size(), (searchEnd - searchStart) / 1_000_000.0);
                for (String s : suggestions) {
                    System.out.println("- " + s + " (freq: " + trie.getFrequency(s) + ")");
                }
            }
        }
        scanner.close();
    }

    private static List<String> loadMoviesFromFile(String filename) {
        List<String> movies = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    movies.add(line.trim());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return movies;
    }
}