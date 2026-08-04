package TMSnew.homework7.TMS.homework15.Task2;
import java.util.LinkedList;
public class AnimalCollection {
        private LinkedList<String> animals = new LinkedList<>();
        public void addAnimal(String animal) {
            animals.addFirst(animal);
        }
        public void removeAnimal() {
            if (!animals.isEmpty()) {
                System.out.println("Удалено: " + animals.removeLast());
            } else {
                System.out.println("Коллекция пустая");
            }
        }
        public void showAnimals() {
            System.out.println(animals);
        }
    }

