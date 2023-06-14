package by.it.boycova.home_work5;

import java.util.Comparator;

public class DataContainerStringComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}