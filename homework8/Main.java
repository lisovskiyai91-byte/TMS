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
