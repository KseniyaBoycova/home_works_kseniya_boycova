package by.it.boycova.home_work5;

import java.util.Comparator;

public class DataContainerIntComparator implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }

}

