package TMSnew.homework7.TMS.TehZadanie2;

public class Board {
    private static final int SIZE = 3;
    private char[][] board;

    public Board() {
        createBoard();
    }

    public void createBoard() {
        board = new char[SIZE][SIZE];
        char symbol = '1';
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = symbol;
                symbol++;
            }
        }
    }
    public void showBoard() {
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public char[][] getBoard() {
        return board;
    }
    public int getSize() {
        return SIZE;
    }
}
