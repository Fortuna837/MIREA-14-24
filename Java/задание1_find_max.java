// Импортируем все классы из пакета java.util (включая List, Arrays, Collections)
import java.util.*;

// Объявляем публичный класс Main
public class Main {
    // Главный метод программы - точка входа
    public static void main(String[] args) {
        // Создаем список целых чисел и инициализируем его значениями
        List<Integer> list = Arrays.asList(10, 20, 5, 30, 15);
        
        // Находим максимальный элемент в списке с помощью Collections.max()
        int max = Collections.max(list);
        
        // Выводим результат на экран
        System.out.println("Максимум: " + max);
    }
}
