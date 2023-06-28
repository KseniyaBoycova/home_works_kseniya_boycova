package home_work7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class RunnerForDecorators {
    public static void main(String[] args) {
        ISearchEngine easySearcher= new EasySearch();
        ISearchEngine regExSearch = new RegExSearch();
        ISearchEngine punctuationNormalizer = new SearchEnginePunctuationNormalizer(new RegExSearch());
        ISearchEngine registerNormalizer = new SearchEngineRegisterNormalizer(new RegExSearch());
        ISearchEngine caseNormalizer= new SearchEngineCaseNormalizer(new EasySearch());

        List<String> wordsToSearch= Arrays.asList("война","и","мир");

        String path= "src/home_work7/BOOKS/Война и мир_книга.txt";

        StringBuilder text = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line).append(" ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Ищем слово в тексте быстрым поиском:");
        for (String word : wordsToSearch) {
            long count = easySearcher.search(text.toString(), word);
            System.out.println("Слово '" + word + "' встречается "+ count + " раз");
        }
        System.out.println();

        System.out.println("Ищем слово в тексте c учетом регистра:");
        for (String word : wordsToSearch) {
            long count = regExSearch.search(text.toString(), word);
            System.out.println("Слово '" + word + "' встречается "+ count + " раз");

        }
        System.out.println();
        System.out.println("Ищем слово в тексте игнорируя регистр:");
        for (String word : wordsToSearch) {
            long count = registerNormalizer.search(text.toString(), word);
            System.out.println("Слово '" + word + "' встречается "+ count + " раз");
        }
        System.out.println();
        System.out.println("Ищем слово в тексте убирая лишние символы:");
        for (String word : wordsToSearch) {
            long count = punctuationNormalizer.search(text.toString(), word);
            System.out.println("Слово '" + word + "' встречается "+ count + " раз");
        }
        System.out.println();
        System.out.println("Ищем слово в тексте без учета падежа:");
        for (String word : wordsToSearch) {
            long count = caseNormalizer.search(text.toString(), word);
            System.out.println("Слово '" + word + "' встречается "+ count + " раз");
        }
    }
}
