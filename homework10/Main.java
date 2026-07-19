package TMSnew.homework7.TMS.homework10;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Alex", 35, "Grodno");
        User user2 = new User("Alexey", 22, "Minsk");
        User user3 = new User("Andrey", 38, "Brest");

        System.out.println(user1);

        System.out.println(user1.equals(user2));
        System.out.println(user1.equals(user3));

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user3.hashCode());

    }
}
