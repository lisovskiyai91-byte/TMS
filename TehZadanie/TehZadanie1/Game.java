package TMSnew.homework7.TMS.TehZadanie.TehZadanie1;

import java.util.Arrays;

public class Game {
    private static final int MAX_ATTEMPTS = 5;

    private String secretWord;
    private char[] revealed;
    private int attemptsLeft;

    private WordManager wordManager = new WordManager();
    private Display display = new Display();
    private InputProcessor inputProcessor = new InputProcessor();
    private RestartGame restartGame = new RestartGame();

    public void playGame() {

        do {

            secretWord = wordManager.chooseWord();

            revealed = new char[secretWord.length()];
            Arrays.fill(revealed, '_');

            attemptsLeft = MAX_ATTEMPTS;

            boolean won = false;

            while (attemptsLeft > 0 && !won) {

                display.showWord(revealed);

                System.out.println("Попыток осталось: " + attemptsLeft);

                won = inputProcessor.processInput(this);

            }

            if (won) {
                System.out.println("Поздравляем! Вы угадали слово: " + secretWord);
            } else {
                System.out.println("Вы проиграли.");
                System.out.println("Загаданное слово: " + secretWord);
            }

        } while (restartGame.restartGame());

        System.out.println("До свидания!");

    }

    public boolean isWordOpened() {

        for (char c : revealed) {

            if (c == '_') {
                return false;
            }

        }

        return true;
    }

    public String getSecretWord() {
        return secretWord;
    }

    public char[] getRevealed() {
        return revealed;
    }

    public int getAttemptsLeft() {
        return attemptsLeft;
    }

    public void setAttemptsLeft(int attemptsLeft) {
        this.attemptsLeft = attemptsLeft;
    }

}
