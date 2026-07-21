/**
 * 4. Ввести 3 строки с консоли. Найти слово, состоящее только из различных символов.
 * Если таких слов несколько, найти первое из них.
 */
package TMSnew.homework7.TMS.homework11;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] strings = new String [3];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        for (String word: strings){
            boolean unique = true;
            for (int i = 0; i < word.length(); i++) {
                for (int j = i + 1; j < word.length() ; j++) {
                    if (word.charAt(i) == word.charAt(j)){
                        unique = false;
                        break;
                    }
                }
                if (!unique) {
                    break;
                }
            }
            if (unique){
                System.out.println(word);
                return;
            }
        }
        System.out.println("Таких слов нет.");
    }
}
