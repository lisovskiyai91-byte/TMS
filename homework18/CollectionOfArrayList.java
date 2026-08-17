/**Задача 1:
        Создать коллекцию класса ArrayList наполнить ее элементами типа Integer. С помощью
        Stream'ов:
        - Удалить дубликаты
        - Оставить только четные элементы
        - Вывести сумму оставшихся элементов в стриме
 **/

package TMSnew.homework7.TMS.homework18;
import java.util.ArrayList;

public class CollectionOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        int sum = numbers.stream().distinct().filter(number -> number % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
