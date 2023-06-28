package home_work7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;


public class TextSet {
    public static void main(String[] args) {
        String path = "src/home_works/war_and_peace/books/война и мир_книга.txt";
        Set<String> wordsSet = new HashSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.trim().split("[():\\.\\?!,;]|(\\-{2})|(\\s\\d+\\s)|( *\\d+\\.)|\\s+|\\\"");
                for (int i = 1; i < words.length; i++) {
                    wordsSet.add(words[i]);
                }
            }
            System.out.println(wordsSet);

            System.out.println(wordsSet.size());
        } catch(IOException e){
                System.out.println(e.getMessage());
        }
    }
}



