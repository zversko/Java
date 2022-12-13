package HomeWork.HomeWork2;

/**
 * **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.
 */

public class task7 {
    
    static String stringFilling(){
        String result = String.valueOf('=').repeat(10000);
        return result;
    }

    static void replaceStringBuilder(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for (int i = 0; i < sb.length(); i++) {
            int f_sign = sb.indexOf("=");
            if (f_sign >= 0){
                sb.replace(f_sign, f_sign + 1, "равно");
            }
        }
        System.out.println(sb);
    }

    static void replacStringAll(String str){
        str = str.replaceAll("=", "равно");
        System.out.println(str);
    }

    public static void main(String[] args) {

        long st1 = System.currentTimeMillis();
        String s1 = stringFilling();
        System.out.println(s1);
        replaceStringBuilder(s1);
        long end = System.currentTimeMillis();
        
        long st2 = System.currentTimeMillis();
        String s2 = stringFilling();
        System.out.println(s2);
        replacStringAll(s2);
        long end2 = System.currentTimeMillis();
        
        System.out.println("StringBuilder: " + (end - st1));
        System.out.println("String: " + (end2 - st2));

    }
}