package TMSnew.homework7.TMS.homework17;

import java.util.function.Function;

public class FunctionOfLambda {
    public static void main(String[] args) {
    Function<String, Double> converter = text ->{
        String[] parts = text.split(" ");
        double byn = Double.parseDouble(parts[0]);
        return byn / 3.2;
    };
        System.out.println(converter.apply("100 BYN"));
        System.out.println(converter.apply("320 BYN"));
        System.out.println(converter.apply("64 BYN"));
}
}

