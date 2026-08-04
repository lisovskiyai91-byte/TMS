package TMSnew.homework7.TMS.homework15;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class SetOfNumbers {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите числа через запятую: ");
            String input = scanner.nextLine();
            String[] numbers = input.split(",");
            Set<String> set = new LinkedHashSet<>();
            for (String number : numbers) {
                set.add(number.trim());
            }
            System.out.println("Без повторений:");
            for (String number : set) {
                System.out.print(number + " ");
            }
        }
    }


