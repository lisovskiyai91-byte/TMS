package TMSnew.homework7.TMS.TehZadanie.TehZadanie1;

import java.util.Scanner;

public class InputProcessor {
    private Scanner scanner = new Scanner(System.in);
    public boolean processInput(Game game) {

        System.out.print("Введите букву или слово: ");
        String input = scanner.nextLine().trim().toLowerCase();

        if (input.length() == 1) {
            char letter = input.charAt(0);
            boolean found = false;

            for (int i = 0; i < game.getSecretWord().length(); i++) {
                if (game.getSecretWord().charAt(i) == letter) {
                    game.getRevealed()[i] = letter;
                    found = true;
                }
            }

            if (!found) {

                game.setAttemptsLeft(game.getAttemptsLeft() - 1);
            }
            return game.isWordOpened();
        }

        if (input.equals(game.getSecretWord())) {
            char[] chars = game.getSecretWord().toCharArray();
            System.arraycopy(chars, 0, game.getRevealed(), 0, chars.length);
            return true;
        }
        game.setAttemptsLeft(game.getAttemptsLeft() - 1);
        return false;
    }
}
