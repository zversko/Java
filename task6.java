package HomeWork.HomeWork2;

/**
 * *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
 */

public class task6 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("qw = er = ty = ui = op");
        System.out.println(sb);
        for (int i = 0; i < sb.length(); i++) {
            int f_sign = sb.indexOf("=");
            if (f_sign >= 0){
                sb.replace(f_sign, f_sign + 1, "равно");
            }
        }
        System.out.println(sb);
    }
}
