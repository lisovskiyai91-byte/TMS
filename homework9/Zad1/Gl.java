/**
 * Задача 1:
 * Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
 * который печатает название должности и имплементировать этот метод в созданные
 * классы.
 */

package TMSnew.homework7.TMS.homework9.Zad1;

public class Gl {
    public static void main(String[] args) {
        Director director = new Director();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();

        director.printPrint();
        worker.printPrint();
        accountant.printPrint();
    }
}
