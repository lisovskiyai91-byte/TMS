package TMSnew.homework7.TMS.TehZadanie2;

import java.util.Scanner;

public class RestartGame {
    private Scanner scanner = new Scanner(System.in);

    public boolean restartGame() {

        while (true) {

            System.out.print("Хотите сыграть еще раз? (Да/Нет): ");
            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("да")
                    || answer.equals("д")
                    || answer.equals("yes")
                    || answer.equals("y")) {

                return true;

            } else if (answer.equals("нет")
                    || answer.equals("н")
                    || answer.equals("no")
                    || answer.equals("n")) {

                System.out.println("Спасибо за игру!");
                return false;

            } else {

                System.out.println("Введите 'Да' или 'Нет'.");

            }
        }
    }
}
