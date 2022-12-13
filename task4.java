package HomeWork.HomeWork2;

/**
 * Семинар № 2, задание 3
 * Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().
 */

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите два числа");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result = 0;
        System.out.println("Введите знак: + - * /");
        String sign = scan.next();
        if (sign.equals("/") & b == 0){
            System.out.println("На ноль делить нельзя");
            System.exit(0);
        }
        else if (sign.equals("+")){
            result = a + b;
        }
        else if (sign.equals("-")){
            result = a - b;
        }
        else if (sign.equals("*")){
            result = a * b;
        }
        else if (sign.equals("/")){
            result = a / b;
        }
        else {
            System.out.println("Такой знак не предусмотрен");
        }
        sb.append(a + " ").append(sign).append(" " + b).append(" = ").append(result);
        System.out.println("Результат " + sb);
        
    }
}
