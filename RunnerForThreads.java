package home_work7;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnerForThreads {
    public static void main(String[] args) {
        // System.out.println("Введите адрес папки, из которой будут считываться текстовые файлы");
        Scanner scanner = new Scanner(System.in);
        String pathOfFolder = "src/home_work7/BOOKS";

        ExecutorService executorService = Executors.newCachedThreadPool();

        boolean continueRunning=true;
        while (continueRunning) {
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

            System.out.println("Введите имя файла, с которыми будем работать и нажмите Enter.");
            List<String> fileNames = new ArrayList<>();
            boolean wish = true;
            do {
                fileNames.add(scanner.nextLine());
                System.out.println("Ввести еще книгу? Введите да или нет");
                String answer = scanner.nextLine();
                if (!answer.equalsIgnoreCase("да")) {
                    wish = false;
                }
                if (answer.equalsIgnoreCase("да")) {
                    System.out.println("Введите имя файла, с которыми будем работать и нажмите Enter.");
                }
            }
            while (wish);

            System.out.println("Введите слово для поиска.");
            String wordToSearch = scanner.nextLine();
            ISearchEngine wordSearcher = new RegExSearch();
            String pathToWrite = "src/home_work7/result.txt";
            for (String fileName : fileNames) {
                executorService.execute(() -> {
                    String pathOfFile = pathOfFolder + "/" + fileName;
                    StringBuilder text = new StringBuilder();
                    try (BufferedReader reader = new BufferedReader(new FileReader(pathOfFile))) {
                        String fileLine;
                        while ((fileLine = reader.readLine()) != null) {
                            text.append(fileLine).append(" ");
                        }
                    } catch (IOException e) {
                        System.out.println(e.getMessage());
                    }
                    long count = wordSearcher.search(text.toString(), wordToSearch);
                    try (Writer writer = new FileWriter(pathToWrite, true)) {
                        writer.write(fileName + " - " + wordToSearch + " - " + count + "\n");
                    } catch (IOException e) {
                        System.out.println("Произошла ошибка при записи в файл: " + e.getMessage());
                    }
                    System.out.println("Слово " + wordToSearch + " в тексте " + fileName + " встречается " + count + " раз");
                    System.out.println("Thread ID: " + Thread.currentThread().getId() + " is processing file " + fileName);
                });
            }

            executorService.shutdown();
            while (!executorService.isTerminated()) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println( e.getMessage());
                }
            }

            System.out.println("Создать новый поиск?");
            String answer = scanner.nextLine();
            if (!answer.equalsIgnoreCase("да")) {
                System.out.println("Поиск завершен.");
                continueRunning = false;
            }
        }
    }
}


