package HomeWork.HomeWork2;

/**
 * Семинар № 2, задание 1
 * Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
 */

public class task1 {

    static int findStringInText(String text, String s) // Ищем одну строку в другой
    {
        if (stringIsEmpty(text) || stringIsEmpty(s)) {
            return -2;
        }
        
        return text.indexOf(s);
        
    }

    static boolean stringIsEmpty(String s) {        // Убеждаемся, что строки не пустые        
        return s == null || s.length() == 0;
    }

    public static void main(String[] args)
    {
        String text = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String str = "GH";
 
        if (findStringInText(text, str) == -2)
        {
            System.out.println("Отсутствует одна из строк");
        }
        else if (findStringInText(text, str) == -1)
        {
            System.out.println("Строка "+str+" не входит в состав строки "+text );
        }
        else 
        {
            System.out.println("Строка "+str+" входит в состав строки "+text );
        }

    }
}
