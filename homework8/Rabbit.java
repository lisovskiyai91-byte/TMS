package TMSnew.homework7.TMS.homework8;

public class Rabbit extends Animal {
    @Override
    public void voice() {
        System.out.println("Кролик делает: пх-пх");
    }
        @Override
    public void eat(String food) {
        if ("grass".equals(food)){
            System.out.println("Кролик любит есть травку. ");
        } else {
            System.out.println("Кролик недоволен. Он не любит " + food + ".");
        }

    }



}
