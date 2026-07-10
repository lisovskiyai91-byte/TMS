package DZ8;

public class Tiger extends Animal {
    @Override
    public void voice() {
        System.out.println("Тигр делает: ррр");
    }

    @Override
    public void eat(String food) {
        if (food.equals("meat")){
            System.out.println("Тигр  ест мясо.");
        } else {
            System.out.println("Тигр недоволен. Он не ест " + food + ".");
        }

    }
}
