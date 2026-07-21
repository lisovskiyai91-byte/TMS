/**
 * 1. Ввести 3 строки с консоли, найти самую короткую и самую длинную строки. Вывести
 * найденные строки и их длину.
 */
package TMSnew.homework7.TMS.homework11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] strings = new String[3];
        for (int i = 0; i < strings.length; i++) {
            System.out.println("Введите строку: ");
            strings[i] = scanner.nextLine();
        }
        String shortest = strings[0];
        String longest = strings[0];
        for (String str: strings){
            if (str.length() < shortest.length()){
                shortest = str;
            }
            if (str.length() > longest.length()){
                longest = str;
            }
        }
        System.out.println("Самая короткая: " + shortest);
        System.out.println("Длина: " + shortest.length());
        System.out.println("Самая длинная: " + longest);
        System.out.println("Длина: " + longest.length());
    }
}
