package TMSnew.homework7.TMS.homework17;
import java.util.Scanner;
import java.util.function.Supplier;

public class LinesBackwards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        Supplier<String> reverse = () -> {
            String result = "";
            for (int i = text.length() - 1; i >= 0; i--) {
                result += text.charAt(i);
            }
            return result;
        };
        System.out.println(reverse.get());
    }
}
