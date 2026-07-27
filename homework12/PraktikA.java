package TMSnew.homework7.TMS.homework12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PraktikA {

    public static void main(String[] args) {

        String text = "Today my 17th lesson. I’m the best 1! Find me in inst: @teachmeskills";

        System.out.println(getDigits(text));
        System.out.println(replaceLetters(text));
        System.out.println(getInstagram(text));

        System.out.println(isNull("null"));
        System.out.println(isNull("NULL"));

        replaceNewLine();

        findName();
    }

    // 1. Вернуть все цифры из строки
    public static String getDigits(String text) {
        return text.replaceAll("\\D", "");
    }

    // 2. Заменить каждую букву на &
    public static String replaceLetters(String text) {
        return text.replaceAll("[A-Za-zА-Яа-яЁё]", "&");
    }

    // 3. Вернуть instagram
    public static String getInstagram(String text) {

        Pattern pattern = Pattern.compile("@[A-Za-z0-9_]+");
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            return matcher.group();
        }

        return null;
    }

    // 4. Вернуть true, если строка имеет вид "null"
    public static boolean isNull(String text) {
        return text.matches("null");
    }

    // 5. Заменить \n на "" через Pattern и Matcher
    public static void replaceNewLine() {

        String text = "Hello \n world \n !!!";

        Pattern pattern = Pattern.compile("\\n");
        Matcher matcher = pattern.matcher(text);

        String result = matcher.replaceAll("");

        System.out.println(result);
    }

    // 6. Найти имя и фамилию
    public static void findName() {

        String text =
                "Всем привет!! Меня зовут Билл Гейтс и я мечтаю учиться в TeachMeSkills!";

        Pattern pattern =
                Pattern.compile("зовут\\s+([А-ЯЁ][а-яё]+)\\s+([А-ЯЁ][а-яё]+)");

        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println(matcher.group(1));
            System.out.println(matcher.group(2));
        }
    }
}