package TMSnew.homework7.TMS.TehZadanie.TehZadanie1;

import java.util.Scanner;

public class RestartGame {
    private Scanner scanner = new Scanner(System.in);

    public boolean restartGame() {

        while (true) {

            System.out.print("Хотите начать заново? (Да/Нет): ");

            String answer = scanner.nextLine().trim().toLowerCase();

            if (answer.equals("да") || answer.equals("д")
                    || answer.equals("yes") || answer.equals("y")) {

                return true;

            }

            if (answer.equals("нет") || answer.equals("н")
                    || answer.equals("no") || answer.equals("n")) {

                return false;

            }

            System.out.println("Введите Да или Нет.");

        }

    }
}
