/**
 * Создать класс для описания пользователя системы. Переопределить в классе методы
 * toString, hashcode и equals. Создать несколько экземпляров класса с одним и тем же
 * значением полей и сравнить с помощью метода equals.
 */

package TMSnew.homework7.TMS.homework10;

import java.util.Objects;

public class User {
    private String name;
    private int age;
    private String city;

public User(String name, int age, String city){
    this.age = age;
    this.name = name;
    this.city = city;
}

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(city, user.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, city);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
