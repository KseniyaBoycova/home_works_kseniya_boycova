package by.it.boycova.home_work5;

public class DataContainerMain {
        public static void main(String[] args) {
            Integer[] arrInt = {};
            String[] arrStr = {};
            DataContainer<Integer> container = new DataContainer<>(arrInt);
            DataContainer<String> container1 = new DataContainer<>(arrStr);


            int index1 = container.add(55);
            int index2 = container.add(13);
            int index3 = container.add(154);
            int index4 = container.add(4);
            Integer element1 = container.get(index1);
            Integer element2 = container.get(index2);
            Integer element3 = container.get(index3);
            Integer element4 = container.get(index4);
            System.out.println (element1);
            System.out.println (element2);
            System.out.println  (element3);
            System.out.println  (element4);
            System.out.println (container.get(index1));

            int index5 = container1.add("Привет");
            int index6 = container1.add("Как дела");
            int index7 = container1.add("Работаю");
            int index8 = container1.add("Давай потом");
            String text1 = container1.get(index5);
            String text2 = container1.get(index6);
            String text3 = container1.get(index7);
            String text4 = container1.get(index8);
            System.out.println (text1);
            System.out.println (text2);
            System.out.println  (text3);
            System.out.println  (text4);
        }
}
