package HomeWork.HomeWork3;

/**
 * *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
 * (Вставить элемент в список в первой позиции.)
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;


public class task11 {
    static long insertMethodArrayList(){
        ArrayList<Integer> list = new ArrayList<Integer>();

        long st = System.currentTimeMillis();
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            list.add(0, rand.nextInt(10));
        }

        System.out.println(list);
        long end = System.currentTimeMillis();
        return (end - st);
    }

    static long insertMethodLinkedList(){
        LinkedList<Integer> list = new LinkedList<Integer>();

        long st = System.currentTimeMillis();
        Random rand = new Random();
        for (int i = 0; i < 10000; i++) {
            list.add(0, rand.nextInt(10));
        }

        System.out.println(list);
        long end = System.currentTimeMillis();
        return (end - st);
    }

    public static void main(String[] args) {
        System.out.println("Метод ArrayList: " + insertMethodArrayList());
        System.out.println("Метод LinkedList: " + insertMethodLinkedList());
    }
}