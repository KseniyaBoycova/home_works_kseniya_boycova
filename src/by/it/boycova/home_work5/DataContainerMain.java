package by.it.boycova.home_work5;

public class DataContainerMain  {
        public static void main(String[] args) {
            Integer [] arrInt={-1,-4,-3,null,-17,-12,-8};
            String[] arrStr={"12","jlg","256796359","3428","12323","3hg4rjhvrvh"};
            DataContainer<Integer> container = new DataContainer<>(arrInt);
            DataContainer<String > container1 = new DataContainer<>(arrStr);
        }
}
