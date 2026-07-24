/**
 * Вывести в консоль из строки которую пользователь вводит с клавиатуры все
 * аббревиатуры. Аббревиатурой будем считать слово от 2 до 6 символов, состоящее
 * только из прописных букв, без чисел.
 */
package TMSnew.homework7.TMS.homework12;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\p{Lu}{2,6}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
