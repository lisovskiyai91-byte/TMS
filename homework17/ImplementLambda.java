package TMSnew.homework7.TMS.homework17;
import java.util.function.Consumer;

public class ImplementLambda {
    public static void main(String[] args) {
        Consumer<String> converter = text -> {
            String[] parts = text.split(" ");
            double byn = Double.parseDouble(parts[0]);
            double usd = byn / 3.0;
            System.out.printf("%.2f USD%n", usd);
        };
        converter.accept("100 BYN");
        converter.accept("320 BYN");
        converter.accept("64 BYN");
    }
}
