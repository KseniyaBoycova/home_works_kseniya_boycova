package home_work7;


public class SearchEngineRegisterNormalizer implements ISearchEngine {

    private ISearchEngine seacher;
    public SearchEngineRegisterNormalizer(ISearchEngine seacher) {
        this.seacher = seacher;
    }

    @Override
    public long search(String text, String word) {
        return seacher.search(text.toLowerCase(),word.toLowerCase());
    }
}
