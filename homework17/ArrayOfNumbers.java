package TMSnew.homework7.TMS.homework17;

import java.util.function.Predicate;

public class ArrayOfNumbers {
    public static void main(String[] args) {
        Integer[] numbers = {-5, 10, -8, 0, 15, 20, -3};
        Predicate<Integer> positive = number -> number > 0;
        System.out.println("Положительные числа:");
        for (Integer number : numbers) {
            if (positive.test(number)) {
                System.out.println(number);
            }
        }
    }
}

