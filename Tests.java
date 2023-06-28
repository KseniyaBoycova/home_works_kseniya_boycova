package tests;

import home_work7.*;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class Tests {
    ISearchEngine easySearch= new EasySearch();
    ISearchEngine regExSearch = new RegExSearch();
    ISearchEngine punctuationNormalizer = new SearchEnginePunctuationNormalizer(new RegExSearch());
    ISearchEngine registerNormalizer = new SearchEngineRegisterNormalizer(new RegExSearch());
    ISearchEngine caseNormaliser= new SearchEngineCaseNormalizer(new RegExSearch());

    String text= "привет, Привет, приветы, приветами, привете, привет-,:привет,--привет" ;
    String line= "приветом";
    @Test
    void search1() {
        long count = easySearch.search(text.toString(), line);
        assertEquals(0, count);
    }

    @Test
    void search2() {
        long count = regExSearch.search(text.toString(), line);
        assertEquals(0, count);
    }

    @Test
    void search3() {
        long count= registerNormalizer.search(text,line);
        assertEquals(0, count);
    }

    @Test
    void search4() {
        long count= punctuationNormalizer.search(text,line);
        assertEquals(0, count);
    }

    @Test
    void search5() {
        long count= caseNormaliser.search(text,line);
        assertEquals(7, count);
    }

}