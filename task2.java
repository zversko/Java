package HomeWork.HomeWork2;

/**
 * Семинар № 2, задание 2
 * Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
 */

public class task2 {
    public static void main(String[] args)
    {    
        String text1 = "qwertyuiop asdfghjkl zxcvbnm";
        String text2 = "mnbvcxz lkjhgfdsa poiuytrewq";
        String[] words1 = text1.split("");      // Переводим обе строки в массив посимвольно
        String[] words2 = text2.split("");

        if (checkPolyndrom(words1, words2))           
        {
            System.out.println("Строка "+text1+" является вращением строки "+text2);
        }
        else
        {
            System.out.println("Строка "+text1+" не является вращением строки "+text2);
        }    
    }

    static boolean checkPolyndrom(String[] words1, String[] words2) // Сравниваем два массива по символам
    {
        if (words1.length == words2.length)
        {
            int count = 0;
            for (int i = 0; i < words1.length; i++) {
                if (words1[i].equals(words2[words2.length - 1 - i]))
                {
                    count++;
                }                   
            }
            if (count == words1.length)
            {
                return true;   
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
}
