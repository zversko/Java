package HomeWork.HomeWork3;

/**
 * 1. Создать новый список, добавить несколько строк и вывести коллекцию на экран.
 * 2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
 * 3. Вставить элемент в список в первой позиции.
 * 4. Извлечь элемент (по указанному индексу) из заданного списка.
 * 5. Обновить определенный элемент списка по заданному индексу.
 * 6. Удалить третий элемент из списка.
 * 7. Поиска элемента в списке по строке.
 * 8. Создать новый список и добавить в него несколько елементов первого списка.
 * 9. Удалить из первого списка все элементы отсутствующие во втором списке.
 */

import java.util.ArrayList;
import java.util.Collections;

public class task1_10 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<String>();         // 1 задание
        colors.add("Red");
        colors.add("Green");;
        colors.add("Blue");
        colors.add("Black");
        colors.add("White");
        colors.add("Sky");
        System.out.println("1: " + colors);

        for (int i = 0; i < colors.size(); i++) {                   // 2 задание
            colors.set(i, colors.get(i) + "!");
        }
        System.out.println("2: " + colors);

        colors.add(3,"Yellow!");                     // 3 задание
        System.out.println("3: " + colors);

        System.out.println("4: " + colors.get(3));           // 4 задание

        colors.set(2, "Gray!");                      // 5 задание  
        System.out.println("5: " + colors);
           
        colors.remove(3);                                    // 6 задание
        System.out.println("6: " + colors);

        if (colors.contains("Gray!")){                            // 7 задание
            System.out.println("7: Gray! в списке под индексом: " + colors.indexOf("Gray!"));
        }
        else System.out.println("7: Элемента Gray! нет");

        ArrayList<String> сolors2 = new ArrayList<String>();        // 8 задание
        сolors2.addAll(0, colors.subList(1,5));
        System.out.println("8: " + сolors2);

        Collections.sort(colors);                                   // 10 задание
        Collections.sort(сolors2);
        System.out.println("10: " + colors);
        System.out.println("10: " + сolors2);

        colors = сolors2;                                           // 9 задание
        System.out.println("9: " + colors);
        System.out.println("9: " + сolors2);
        
    }
}