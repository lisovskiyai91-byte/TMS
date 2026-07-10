package DZ8;

    public class Dog extends Animal {
        @Override
        public void voice() {
            System.out.println("Собака говорит: гав-гав");
        }

        @Override
        public void eat(String food) {
            if (food.equals("meat")){
                System.out.println("Собака ест мясо.");
            } else {
                System.out.println("Собака недовольна. Она не любит " + food + ".");
            }

        }
    }
