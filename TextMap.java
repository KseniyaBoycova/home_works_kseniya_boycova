package home_work7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TextMap {

    public static void main(String[] args) {
        String path = "src/home_works/war_and_peace/books/война и мир_книга.txt";
        Map<String, Integer> wordMap = new HashMap<>();
        int N = 10;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.trim().split("[():\\.\\?!,;]|(\\-{2})|(\\s\\d+\\s)|( *\\d+\\.)|\\s+|\\\"");
                for (String word : words){
                    if (!word.isEmpty()) {
                        wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        List<Map.Entry<String, Integer>> wordsList = new ArrayList<>(wordMap.entrySet());

        wordsList.sort(Map.Entry.<String,Integer>comparingByValue().reversed());

        for (int i = 0; i < N && i < wordsList.size(); i++) {
            Map.Entry<String, Integer> word = wordsList.get(i);
            System.out.println("Слово '"+ word.getKey()+ "' встречается "+ word.getValue()+" раз.");
        }
    }
}
