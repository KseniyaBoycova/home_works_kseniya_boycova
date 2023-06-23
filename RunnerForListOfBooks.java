package home_work7;


import java.io.*;
import java.util.List;
import java.util.Scanner;

public class RunnerForListOfBooks {

    public static void main(String[] args) {

        System.out.println("Введите адрес папки, из которой будут считываться текстовые файлы");
        Scanner scanner= new Scanner(System.in);
        String pathOfFolder= scanner.nextLine();
        //"src/home_work7/BOOKS"

        boolean continueRunning = true;
        do {
            System.out.println("Выберите файл, с которым будем работать");
            StringBuilder listOfBooks = new StringBuilder();
            File folderOfFiles = new File(pathOfFolder);
            File[] listOfFiles = folderOfFiles.listFiles();
            if (listOfFiles != null) {
                for (File file : listOfFiles) {
                    if (file.isFile()) {
                        listOfBooks.append(file.getName()).append("\n");
                    }
                }
            }
            System.out.println(listOfBooks);

            String file= scanner.nextLine();
            String path = "src/home_work7/BOOKS/"+file;
            StringBuilder text = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    text.append(line).append(" ");
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Введите слова для поиска.");
            List<String> wordsToSearch= List.of(scanner.nextLine());

            ISearchEngine wordSearcher = new RegExSearch();

            String pathToWrite= "src/home_work7/result.txt";
            File fileToWrite= new File(pathToWrite);
            System.out.println("Ищем слово в тексте c учетом регистра:");
            for (String word : wordsToSearch) {
                long count = wordSearcher.search(text.toString(), word);
                try (Writer writer = new FileWriter(fileToWrite,true)) {
                    writer.write(file +" - "+ wordsToSearch+ " - "+count+"\n");
                } catch (IOException e) {
                    System.out.println("Произошла ошибка при записи в файл: " + e.getMessage());
                }
                System.out.println("Слово " + word + " встречается "+ count + " раз");
            }
            System.out.println("Создать новый поиск?");
            String answer=scanner.nextLine();

            if (!answer.equals("да")) {
                continueRunning = false;
                System.out.println("Поиск завершен.");
            }
        } while (continueRunning);
    }
}
