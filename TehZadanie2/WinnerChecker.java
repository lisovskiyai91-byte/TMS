package TMSnew.homework7.TMS.TehZadanie2;

public class WinnerChecker {
    public boolean checkWinner(Board board, char symbol) {
        char[][] field = board.getBoard();
        // Проверка строк
        for (int i = 0; i < board.getSize(); i++) {
            if (field[i][0] == symbol &&
                    field[i][1] == symbol &&
                    field[i][2] == symbol) {
                return true;
            }
        }
        // Проверка столбцов
        for (int i = 0; i < board.getSize(); i++) {
            if (field[0][i] == symbol &&
                    field[1][i] == symbol &&
                    field[2][i] == symbol) {
                return true;
            }
        }
        // Главная диагональ
        if (field[0][0] == symbol &&
                field[1][1] == symbol &&
                field[2][2] == symbol) {
            return true;
        }
        // Побочная диагональ
        if (field[0][2] == symbol &&
                field[1][1] == symbol &&
                field[2][0] == symbol) {
            return true;
        }
        return false;
    }
    public boolean isDraw(Board board) {
        char[][] field = board.getBoard();
        for (int i = 0; i < board.getSize(); i++) {
            for (int j = 0; j < board.getSize(); j++) {
                if (field[i][j] != 'X' && field[i][j] != 'O') {
                    return false;
                }
            }
        }
        return true;
    }
}
