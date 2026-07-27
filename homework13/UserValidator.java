package TMSnew.homework7.TMS.homework13;

public class UserValidator {
    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            if (login.length() >= 20 || login.contains(" ")) {
                throw new WrongLoginException("Login должен быть меньше 20 символов и без пробелов");
            }
            if (password.length() >= 20 ||
                    password.contains(" ") ||
                    !password.matches(".*\\d.*") ||
                    !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Password введен неверно");
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
