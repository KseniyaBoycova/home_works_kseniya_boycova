package home_work7;

public class SearchEnginePunctuationNormalizer implements ISearchEngine {

    private ISearchEngine searcher;

     public SearchEnginePunctuationNormalizer(ISearchEngine searcher) {
        this.searcher = searcher;
     }
    @Override
    public long search(String text, String word) {
        String newText=text.replaceAll("[():\\.\\?!,;]|(\\-{2})|(\\s\\d+\\s)|( *\\d+\\.)|\\s+|\\\""," ").replaceAll("\\s+"," ");
        return searcher.search(newText,word);
    }
}
