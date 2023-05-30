package by.it.boycova.home_work5;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T>{

    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    public int add(T item) {
        if(item==null){
            return -1;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        T[] arr= Arrays.copyOf(data,data.length+1);
        arr[arr.length-1]=item;
        data= arr;
        return arr.length-1;
    }


    public T get(int index) {

        if (index < 0 || index >= data.length) {
            return null;
        }
        return data[index];
    }


    public T[] getItems() {
        return this.data;
    }

    public boolean delete(int index){

        if (index < 0 || index >= data.length) {
            return false;
        }
        T [] newData = Arrays.copyOf(data, data.length-1);
        for (int i = 0, j = 0; i < data.length; i++) {
            if (i == index) {
                continue;
            }
            newData[j++] = data[i];
        }
        data = newData;
        return true;
    }


   public boolean delete(T item){
       if (item == null) {
           return false;
       }
       boolean same=false;
       int counter=0;

       T [] newData = Arrays.copyOf(data, data.length);
       for (int i = 0, j = 0; i < data.length-1; i++) {
           if(data[i]!=null) {
               if (data[i].equals(item)) {
                   same = true;
                   counter++;
                   continue;
               }
           }
           newData[j++] = data[i];
       }
       if(same) {
           T[] finalData = Arrays.copyOf(data, data.length - counter);
           for (int k = 0; k < finalData.length - 1; k++) {
               finalData[k] = newData[k];
           }
           data = finalData;
           return true;
       }
       return false;
   }


    public void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (comparator.compare(data[j], data[j + 1]) > 0) {
                    T temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder line = new StringBuilder();
            line.append("[");
        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                line.append(data[i].toString());
                line.append(", ");
                }
            }
        if (line.length() > 2) {
            line.delete(line.length() - 2, line.length());
            }
        line.append("]");
        return line.toString();
    }

}




