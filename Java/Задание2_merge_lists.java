// Импортируем все классы из пакета java.util (включая List, Arrays, ArrayList)
import java.util.*;

// Объявляем публичный класс task2_merge_lists
public class task2_merge_lists {
    // Главный метод программы - точка входа
    public static void main(String[] args) {
        // Создаем первый неизменяемый список строк с буквами
        List<String> list1 = Arrays.asList("a", "b", "c");
        // Создаем второй неизменяемый список строк с цифрами
        List<String> list2 = Arrays.asList("1", "2", "3");
        
        // Выводим на экран содержимое первого списка
        System.out.println("Первый список: " + list1);
        // Выводим на экран содержимое второго списка
        System.out.println("Второй список: " + list2);
        
        // Создаем новый изменяемый ArrayList для объединения списков
        List<String> merged = new ArrayList<>();
        // Добавляем все элементы из первого списка в объединенный список
        merged.addAll(list1);
        // Добавляем все элементы из второго списка в объединенный список
        merged.addAll(list2);
        
        // Выводим на экран результат объединения
        System.out.println("Объединенный список: " + merged);
    }
}
