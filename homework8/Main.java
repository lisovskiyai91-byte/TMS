/**
 * teachmeskills.by
 * Задача 1:
 * Создать логически верную иерархию следующих классов: Animal, Dog, Tiger, Rabbit.
 * Переопределить методы voice(), eat(String food) чтобы они выводили верную
 * информацию. Метод eat может принимать “Meat”, “Grass” и другие строки.
 * Например, если мы создадим объект класса Rabbit, вызовем метод eat() и передадим
 * туда “Grass” он должен написать в консоли что любит есть травку. Если передадим “Meat”
 * или другую строку то он будет недоволен
 */

package DZ8;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal tiger = new Tiger();
        Animal rabbit = new Rabbit();

        dog.voice();
        dog.eat("meat");
        dog.eat("grass");
        System.out.println();

        tiger.voice();
        tiger.eat("grass");
        tiger.eat("meat");
        System.out.println( );

        rabbit.voice();
        rabbit.eat("meat");
        rabbit.eat("grass");



    }
}
