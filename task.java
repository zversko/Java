package HomeWork.HomeWork5;

import java.util.*;

/**
 * Создать словарь HashMap. Обобщение <Integer, String>.
 * Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключ, если не было!)
 * Изменить значения сделав пол большой буквой.
 * Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."
 * *Сортировать значения по возрасту и вывести отсортированную коллекция как в четвёртом пункте.
 */

public class task {

    static ArrayList<String> list_fname = new ArrayList<>();
    static ArrayList<String> list_lname = new ArrayList<>();
    static ArrayList<String> list_tname = new ArrayList<>();
    static ArrayList<Integer> list_age = new ArrayList<>();
    static ArrayList<String> list_sex = new ArrayList<>();
    static List<Integer> linkedlist = new LinkedList<>();
    public static void main(String[] args) {
    
        HashMap<Integer, String> FioAgeGender = new HashMap<>();
        FioAgeGender.putIfAbsent(1,"Дегтярев Максим Робертович 47 м");
        FioAgeGender.putIfAbsent(2,"Дегтярева Маргарита Адамовна 81 ж");
        FioAgeGender.putIfAbsent(3,"Киселева Александра Кирилловна 17 ж");
        FioAgeGender.putIfAbsent(4,"Козлов Дмитрий Максимович 20 м");
        FioAgeGender.putIfAbsent(5,"Позднякова Таисия Фёдоровна 73 ж");
        FioAgeGender.putIfAbsent(6,"Кудряшов Андрей Маркович 12 м");
        FioAgeGender.putIfAbsent(7,"Прохоров Тимур Вадимович 66 м");
        FioAgeGender.putIfAbsent(8,"Золотарева София Александровна 81 ж");
        FioAgeGender.putIfAbsent(9,"Анисимова Евгения Евгеньевна 27 ж");
        FioAgeGender.putIfAbsent(10,"Сафонова Элина Ивановна 49 ж");
        
        // Вывод полного списка на экран
        outputList(FioAgeGender);
        // Увеличение буквы обозначения пола
        increaseGender(FioAgeGender);
        // Вывод списка в виде "Иванов И.И. AGE GENDER"
        outputLastnameInitials(FioAgeGender);
        // Сортировка списка во возрасту в виде "Иванов И.И. AGE GENDER"
        outputSortAge(FioAgeGender);    
    }
    
    static void outputList(HashMap<Integer, String> FioAgeGender){
        System.out.println();
        System.out.println("Вывод списка\n");
        FioAgeGender.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }

    static void increaseGender(HashMap<Integer, String> FioAgeGender){
        System.out.println();
        System.out.println("Изменить значения сделав пол большой буквой");

        for (Integer key: FioAgeGender.keySet()){          
            String str = FioAgeGender.get(key);
            int index = str.length() - 1;
            char ch = Character.toUpperCase(str.charAt(index));
            StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(index, ch);
            str = sb.toString();
            FioAgeGender.put(key, str);
        }
        outputList(FioAgeGender);
    }

    static void outputLastnameInitials(HashMap<Integer, String> FioAgeGender){
        System.out.println();
        System.out.println("Пройти по коллекции и вывести значения в формате Фамилия инициалы\n");

        for (Integer key: FioAgeGender.keySet()){
            String[] str = FioAgeGender.get(key).split(" ");
            System.out.println(
                key + " " + str[0] 
                + " " + Character.toUpperCase(str[1].charAt(0)) + "."
                + " " + Character.toUpperCase(str[2].charAt(0)) + "."
                + " " + str[3] + " " + str[4]);
        }
    }

    static void outputSortAge(HashMap<Integer, String> FioAgeGender){
        System.out.println();
        System.out.println("*Сортировать значения по возрасту и вывести отсортированную коллекция как в четвёртом пункте\n");

        for (Integer key: FioAgeGender.keySet()){
            String[] l_f_t_a_s = FioAgeGender.get(key).split(" ");
            list_lname.add(l_f_t_a_s[0]);
            list_fname.add(l_f_t_a_s[1]);
            list_tname.add(l_f_t_a_s[2]);
            list_age.add(Integer.parseInt(l_f_t_a_s[3]));
            list_sex.add(l_f_t_a_s[4]);
            linkedlist.add(list_age.size() - 1);
        }
        int cnt = linkedlist.size() - 1;
        while (cnt > -1) {
            int max_age = list_age.get(linkedlist.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++){
                if (max_age < list_age.get(linkedlist.get(i))){
                    max_age = list_age.get(linkedlist.get(i));
                    index = i;                    }
            }    
            int tmp = linkedlist.get(cnt);
            linkedlist.set(cnt, linkedlist.get(index));
            linkedlist.set(index, tmp);
            cnt--;
        }
        printToDisplay(FioAgeGender);
    }

    static void printToDisplay(HashMap<Integer, String> FioAgeGender){
        linkedlist.forEach(i -> System.out.println(
            list_lname.get(i) + " " +
            list_fname.get(i).toUpperCase().charAt(0) + "." + " " +
            list_tname.get(i).toUpperCase().charAt(0) + "." + " " +
            list_age.get(i) + " " + list_sex.get(i)));
        System.out.println();
    }

}
