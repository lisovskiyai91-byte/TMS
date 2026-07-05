package TMSnew.homework7.TMS.TehZadanie.TehZadanie1;

import java.util.Random;

public class WordManager {
    private String[] words = {
            "программа", "компьютер", "клавиатура", "монитор", "процессор",
            "алгоритм", "переменная", "функция", "массив", "строка",
            "консоль", "разработка", "тестирование", "интерфейс", "библиотека",
            "структура", "рекурсия", "компиляция", "исключение", "интерпретатор"
    };

    public String chooseWord() {

        Random random = new Random();

        return words[random.nextInt(words.length)];

    }

}
