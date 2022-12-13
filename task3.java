package HomeWork.HomeWork2;

/**
 * Семинар № 2, задание 3
 * Напишите программу, чтобы перевернуть строку с помощью рекурсии.
 */

public class task3 {
    static String stringRecursion(String s, int length_){
        if (length_ == 0){
            return s.charAt(length_) + "";
        }
        else {
            return (s.charAt(length_) + stringRecursion(s, length_ - 1)); // Зацикливаем метод, пока length_ не будет равно нулю
        }
    }
    public static void main(String[] args) {
        String str = "qwertyuiop";
        int length_ = str.length();
        System.out.println(str);
        str = stringRecursion(str, length_ - 1);
        System.out.println(str);
    }
}
