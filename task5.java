package HomeWork.HomeWork2;

/**
 * Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
 */

public class task5 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("qw = er = ty = ui = op");
        System.out.println(sb);
        for (int i = 0; i < sb.length(); i++) {
            int f_sign = sb.indexOf("=");
            if (f_sign > 0){
                sb.deleteCharAt(f_sign);
                sb.insert(f_sign, "равно");
            }
        }
        System.out.println(sb);

    }
}