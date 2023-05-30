package by.it.boycova.tests.home_work5;

import by.it.boycova.home_work5.DataContainer;
import by.it.boycova.home_work5.DataContainerStringComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class DataContainerTest<T> {

    @Test
    public void testAdd() {
        String [] arr = new String[]{"1",null,"2","3"};
        DataContainer<String> container = new DataContainer<>(arr);
        String str = "4";
        String str1 = "5";
        String str3=null;
        int actual = container.add(str);
        Assertions.assertEquals(1, actual);
        int actual1 = container.add(str1);
        Assertions.assertEquals(4, actual1);
        int actual3 = container.add(str3);
        Assertions.assertEquals(-1, actual3);
    }

    @Test
    public void  testGet() {
        String [] arr = new String[]{"1",null,"2","3"};
        DataContainer<String> container = new DataContainer<>(arr);
        int index=3;
        String actual= container.get(index);
        Assertions.assertEquals("3", actual);

    }


    @Test
    public void  testGetItem() {
        String [] arr = new String[]{"1",null,"2","3"};
        DataContainer<String> container = new DataContainer<>(arr);
        String [] actual= container.getItems();
        Assertions.assertEquals(arr, actual);

    }
    @Test
    public void testDelete(){
        String [] arr = new String[]{"1",null,"2","3"};
        DataContainer<String> container = new DataContainer<>(arr);
        boolean actual=container.delete(3);
        assertTrue(actual);
        boolean actual1=container.delete(-1);
        assertFalse(actual1);
        boolean actual2=container.delete(4);
        assertFalse(actual2);

    }

    @Test
    public void testDeleteItem(){
        String [] arr = new String[]{"1","2",null,"3"};
        DataContainer<String> container = new DataContainer<>(arr);
        boolean actual=container.delete("1");
        assertTrue(actual);
        boolean actual1=container.delete(null);
        assertFalse(actual1);
        boolean actual2=container.delete("4");
        assertFalse(actual2);
    }

    @Test
    public void testSort() {
        String [] arr = new String[]{"177","16","3"};
        DataContainer<String> container = new DataContainer<>(arr);
        DataContainerStringComparator element= new DataContainerStringComparator();
        String [] expected = new String [] {"3","16","177"};
        container.sort(element);
        Assertions.assertArrayEquals(expected, container.getItems());
    }

    @Test
    public void testToString() {
        String [] arr = new String[]{"1","5","3"};
        DataContainer<String> container = new DataContainer<>(arr);
        String actual=container.toString();
        String expected="[1, 5, 3]";
        Assertions.assertEquals(expected, actual);
    }
}