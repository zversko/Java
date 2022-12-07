/**
 * program
 * Семинар № 1:
 * 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
 * 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
 * 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
 * 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
 */

import java.util.Random;

public class program {
    public static void main(String[] args){
        int i = genNumber();            // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        System.out.println("1. Случайное число равно = " + i);
        int n = findHighBit(i);         // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        System.out.println("2. Старший значащий бит = " + n);
        findMultiplesNumber(i, n);      // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        findNOMultiplesNumber(i, n);    // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

    }

    static int genNumber(){
        return new Random().nextInt(2001);    
    }
    
    static int findHighBit(int i){
        int highBit = 0;
        while (i != 1){
            i >>= 1;
            highBit++;
        }
        return highBit;
    }

    static void findMultiplesNumber(int i, int n){
        System.out.println("3. Кратные числа " + n + " в диапазоне от " + i + " до " + Short.MAX_VALUE);
        int[] m1 = new int[0];
        while (i <= Short.MAX_VALUE){
            if (i % n == 0){
                int[] temp = new int[m1.length + 1];
                for (int j = 0; j < m1.length; j++){
                    temp[j] = m1[j];
                }
                m1 = temp;
                m1[m1.length - 1] = i;
            }
            i++;
        }
        for (int j = 0; j < m1.length; j++) {
            System.out.printf(m1[j] + " ");
        }
        System.out.println();

    }

    static void findNOMultiplesNumber(int i, int n){
        System.out.println("4. Кратные числа " + n + " в диапазоне от " + Short.MIN_VALUE + " до " + i);
        int[] m2 = new int[0];
        int d = Short.MIN_VALUE;
        while (d <= i){
            if (d % n != 0){
                int[] temp = new int[m2.length + 1];
                for (int j = 0; j < m2.length; j++){
                    temp[j] = m2[j];
                }
                m2 = temp;
                m2[m2.length - 1] = d;
            }
            d++;
        }
        for (int j = 0; j < m2.length; j++) {
            System.out.printf(m2[j] + " ");
        }

    }

}