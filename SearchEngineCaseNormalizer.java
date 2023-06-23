package home_work7;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SearchEngineCaseNormalizer implements ISearchEngine {

    private ISearchEngine searcher;
    public SearchEngineCaseNormalizer(ISearchEngine searcher) {
        this.searcher = searcher;
    }
    List<String> endings= Arrays.asList("а", "у","ом", "е", "ы","ов","ой","ам","ах","о", "ами","и","");
    @Override
    public long search(String text, String word) {
        String wordWithoutEnding=null;
        for (String ending : endings) {
            String pattern = ending + "$";
            if (word.matches(".*" + pattern)) {
                wordWithoutEnding = word.substring(0, word.lastIndexOf(ending));
                break;
            }
        }
        long count = 0;
        for (String ending : endings) {
            Pattern pattern = Pattern.compile("\\b" + wordWithoutEnding + ending + "\\b");
            Matcher matcher = pattern.matcher(text);
            while (matcher.find()) {
                count++;
            }
        }
        return count;
    }
}


