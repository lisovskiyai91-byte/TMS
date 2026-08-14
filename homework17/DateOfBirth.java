package TMSnew.homework7.TMS.homework17;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateOfBirth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату своего рождения: ");
        String birthday = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.parse(birthday, formatter);
        LocalDate hundredYears = date.plusYears(100);
        System.out.println(hundredYears.format(formatter));
    }
}
