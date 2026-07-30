package TMSnew.homework7.TMS.homework14;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File file = new File("src/TMSnew/homework7/TMS/homework14/Romeo and Juliet.txt");

        String longestWord = "";

        try {

            Scanner scanner = new Scanner(file);

            while (scanner.hasNext()) {

                String word = scanner.next();

                // Удаляем знаки препинания
                word = word.replaceAll("[^A-Za-z]", "");

                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            scanner.close();

            FileWriter writer = new FileWriter("src/TMSnew/homework7/TMS/homework14/result.txt");
            writer.write(longestWord);
            writer.close();

            System.out.println("Самое длинное слово: " + longestWord);

        } catch (IOException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
