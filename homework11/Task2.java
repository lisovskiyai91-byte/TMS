/**
 * 2. Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке возрастания
 * значений их длины.
 */
package TMSnew.homework7.TMS.homework11;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] strings = new String[3];

        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }
        for (int i = 0; i < strings.length-1; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (strings[i].length() > strings[j].length()) {
                    String tmp = strings[i];
                    strings[i] = strings[j];
                    strings[j] = tmp;
                }
            }
        }
        for (String str: strings){
            System.out.println(str);
        }
    }
}
