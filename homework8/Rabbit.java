package DZ8;

public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("Кролик делает: пх-пх");
    }
        @Override
    public void eat(String food) {
        if (food.equals("meat")){
            System.out.println("Кролик недоволен. Он не любит " + food + ".");
        } else {
            System.out.println("Кролик любит есть травку. ");
        }

    }



}
