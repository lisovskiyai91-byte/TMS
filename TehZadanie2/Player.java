package TMSnew.homework7.TMS.TehZadanie2;

import java.util.Scanner;

public class Player {
    private Scanner scanner = new Scanner(System.in);
    public void playerMove(Board board, char playerSymbol) {
        while (true) {
            System.out.print("Введите координаты (строка столбец): ");
            String input = scanner.nextLine().trim();
            input = input.replace(",", " ");
            String[] coordinates = input.split("\\s+");
            if (coordinates.length != 2) {
                System.out.println("Неверный формат ввода!");
                continue;
            }
            try {
                int row = Integer.parseInt(coordinates[0]);
                int col = Integer.parseInt(coordinates[1]);
                if (row < 0 || row >= board.getSize()
                        || col < 0 || col >= board.getSize()) {
                    System.out.println("Таких координат нет!");
                    continue;
                }
                char cell = board.getBoard()[row][col];
                if (cell == 'X' || cell == 'O') {
                    System.out.println("Клетка уже занята!");
                    continue;
                }

                board.getBoard()[row][col] = playerSymbol;
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введите только числа!");
            }
        }
    }
}
