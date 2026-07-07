package TMSnew.homework7.TMS.TehZadanie2;

import java.util.Random;

public class Game {
    private Random random = new Random();

    private Board board = new Board();
    private Player player = new Player();
    private AI ai = new AI();
    private WinnerChecker winnerChecker = new WinnerChecker();
    private RestartGame restartGame = new RestartGame();

    private char playerSymbol;
    private char aiSymbol;
    private boolean playerTurn;

    public void playGame() {
        do {
            board.createBoard();
            determineFirstPlayer();
            boolean gameOver = false;
            while (!gameOver) {
                board.showBoard();
                if (playerTurn) {
                    player.playerMove(board, playerSymbol);
                    if (winnerChecker.checkWinner(board, playerSymbol)) {
                        board.showBoard();
                        System.out.println("Поздравляем! Вы победили!");
                        gameOver = true;
                    }
                } else {
                    ai.aiMove(board, aiSymbol);
                    if (winnerChecker.checkWinner(board, aiSymbol)) {
                        board.showBoard();
                        System.out.println("Компьютер победил!");
                        gameOver = true;
                    }
                }
                if (!gameOver && winnerChecker.isDraw(board)) {
                    board.showBoard();
                    System.out.println("Ничья!");
                    gameOver = true;
                }
                playerTurn = !playerTurn;
            }
        } while (restartGame.restartGame());
    }
    private void determineFirstPlayer() {
        playerTurn = random.nextBoolean();
        if (playerTurn) {
            playerSymbol = 'X';
            aiSymbol = 'O';
            System.out.println("Первым ходит игрок.");
        } else {
            playerSymbol = 'O';
            aiSymbol = 'X';

            System.out.println("Первым ходит компьютер.");
        }
    }
}
