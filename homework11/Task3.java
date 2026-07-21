/**
 * 3. Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых меньше
 * средней, а также их длину.
 */
package TMSnew.homework7.TMS.homework11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] strings = new String[3];
        System.out.println("Введите строки:");
        int sum = 0;
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
            sum += strings[i].length();

        }
        double average = (double) sum / strings.length;
        System.out.println("Средняя длина = " + average);
        for (String str: strings){
            if (str.length() < average){
                System.out.println(str + " (" + str.length() + ")");
            }
        }
    }
}
