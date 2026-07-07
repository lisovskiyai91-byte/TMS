package TMSnew.homework7.TMS.TehZadanie2;

import java.util.Random;

public class AI {
    private Random random = new Random();

    public void aiMove(Board board, char aiSymbol) {

        while (true) {

            int row = random.nextInt(board.getSize());
            int col = random.nextInt(board.getSize());
            char cell = board.getBoard()[row][col];
            if (cell != 'X' && cell != 'O') {

                board.getBoard()[row][col] = aiSymbol;
                System.out.println("Компьютер сходил в клетку: " + row + " " + col);

                break;
            }
        }
    }
}
