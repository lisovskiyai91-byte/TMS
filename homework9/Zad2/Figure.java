/**
 * Задача 2:
 * Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
 * функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
 * абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
 * периметра всех фигур в массиве.
 */

package TMSnew.homework7.TMS.homework9.Zad2;

public class Figure {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Triangle(4,6,7), new Rectangle(2,6), new Circle(3), new Rectangle(3,6)
        };
        double sum = 0;
        for (Shape shape: shapes){
            sum += shape.getPerimeter();
        }
        System.out.println("Сумма периметров = " + sum);
    }
}
