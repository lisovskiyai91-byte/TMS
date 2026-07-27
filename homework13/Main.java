package TMSnew.homework7.TMS.homework13;

public class Main {
    public static void main(String[] args) {
        boolean result1 = UserValidator.validate("Alex", "hello123", "hello123");
        System.out.println(result1);
        boolean result2 = UserValidator.validate("Alex Lisovskiy", "hello123", "hello123");
        System.out.println(result2);
        boolean result3 = UserValidator.validate("Alex", "hello", "hello");
        System.out.println(result3);
    }
}

