package TMSnew.homework7.TMS.homework15.Task2;

public class main {
    public static void main(String[] args) {
        AnimalCollection collection = new AnimalCollection();
        collection.addAnimal("Dog");
        collection.addAnimal("Cat");
        collection.addAnimal("Tiger");
        collection.addAnimal("Rabbit");
        collection.showAnimals();
        collection.removeAnimal();
        collection.showAnimals();
    }
}
