package HomeWork.HomeWork4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class task1_4 {
    static ArrayList<String> list_fname = new ArrayList<>();
    static ArrayList<String> list_lname = new ArrayList<>();
    static ArrayList<String> list_tname = new ArrayList<>();
    static ArrayList<Integer> list_age = new ArrayList<>();
    static ArrayList<Boolean> list_sex = new ArrayList<>();
    static List<Integer> linkedlist = new LinkedList<>();

    public static void main(String[] args) {

        putTo("Ushakov Ivan Ivanovich", 16, "M");
        putTo("Traumec Fedr Ivanovich", 16, "M");
        putTo("Baturin Strepan Ivanovich", 51, "M");
        putTo("Kudrin Olga Ivanovna", 34, "F");
        putTo("Sidorova Jezel Alexndrovna", 43, "F");
        putTo("Ivanova Anna Ivanovna", 16, "F");
        putTo("Volkov Sveta Ivanovich", 34, "F");
        putTo("Cikorin Stepan Ivanovich", 34, "M");
        
        choiceMethod();
    }

    static void outputAge(int key){
        int cnt = linkedlist.size()-1;
        while (cnt > -1) {
            int max_age = list_age.get(linkedlist.get(cnt));
            int index = cnt;
            if (key == 0){
                for (int i = 0; i < cnt; i++){
                    if (max_age < list_age.get(linkedlist.get(i))){
                        max_age = list_age.get(linkedlist.get(i));
                        index = i;
                    }
                }    
                int tmp = linkedlist.get(cnt);
                linkedlist.set(cnt, linkedlist.get(index));
                linkedlist.set(index, tmp);
            }
            else if (key == 1){
                for (int i = 0; i < cnt; i++){
                    if (max_age < list_age.get(linkedlist.get(i)) && !list_sex.get(linkedlist.get(i))){
                        max_age = list_age.get(linkedlist.get(i));
                        index = i;
                    }
                }    
                if (!list_sex.get(linkedlist.get(cnt))){
                    int tmp = linkedlist.get(cnt);
                    linkedlist.set(cnt, linkedlist.get(index));
                    linkedlist.set(index, tmp);
                }
                else if (list_sex.get(linkedlist.get(cnt))){
                    for (int i = 0; i < cnt; i++){
                        if (max_age < list_age.get(linkedlist.get(i))){
                            max_age = list_age.get(linkedlist.get(i));
                            index = i;
                        }
                    }    
                    int tmp = linkedlist.get(cnt);
                    linkedlist.set(cnt, linkedlist.get(index));
                    linkedlist.set(index, tmp);
                }
            }
            cnt--;
        }
    }

    static void outputMaleOrFemale(){
        int cnt = linkedlist.size()-1;
        while (cnt > -1) {
            Boolean MaleOrFemale = list_sex.get(linkedlist.get(cnt));
            int index = cnt;
            for (int i = 0; i < cnt; i++){
                if (MaleOrFemale){
                    MaleOrFemale = list_sex.get(linkedlist.get(i));
                    index = i;
                }
            }
            int tmp = linkedlist.get(cnt);
            linkedlist.set(cnt, linkedlist.get(index));
            linkedlist.set(index, tmp);
            cnt--;
        }
    }

    static void outputLastName(int key){
        int cnt = linkedlist.size()-1;
        while (cnt > -1) {
            String LName = list_lname.get(linkedlist.get(cnt));
            Boolean MaleOrFemale = list_sex.get(linkedlist.get(cnt));
            int varAge = list_age.get(linkedlist.get(cnt));
            int index = cnt;
            if (key == 0){
                for (int i = 0; i < cnt; i++){
                    if (LName.compareToIgnoreCase(list_lname.get(linkedlist.get(i))) < 0){
                        LName = list_lname.get(linkedlist.get(i));
                        index = i;
                    }
                }
            }
            else if (key == 1){
                for (int i = 0; i < cnt; i++){
                    if (LName.compareToIgnoreCase(list_lname.get(linkedlist.get(i))) < 0 
                            && MaleOrFemale.equals(list_sex.get(linkedlist.get(i)))
                            && varAge == list_age.get(linkedlist.get(i))){
                        LName = list_lname.get(linkedlist.get(i));
                        index = i;
                    }
                }
            }
            int tmp = linkedlist.get(cnt);
            linkedlist.set(cnt, linkedlist.get(index));
            linkedlist.set(index, tmp);
            cnt--;
        }
    }

    static void addNewContact(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите новый контакт");
        System.out.println("Укажите Фамилию Имя Отчество (через пробел)");
        String fio = scan.next();
        System.out.println("Укажите возраст");
        int age = scan.nextInt();
        System.out.println("Укажите гендер (M или F)");
        String MOF = scan.next();

        putTo(fio, age, MOF);
    }

    static void printToDisplay(){
        linkedlist.forEach(i -> System.out.println(list_fname.get(i)
            + " " + list_lname.get(i).toUpperCase().charAt(0)
            + "." + list_tname.get(i) + " " + list_age.get(i) + " " 
            + list_sex.get(i)));
        System.out.println();
    }

    static void putTo(String fio, int age, String gender){
        list_age.add(age);
        String[] fio1 = fio.split(" ");
        list_fname.add(fio1[1]);
        list_lname.add(fio1[0]);
        list_tname.add(fio1[2]);
        if (gender.contains("F")) {list_sex.add(true);} else  {list_sex.add(false);}
        linkedlist.add(list_age.size() - 1);
    }

    static void choiceMethod(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите из списка нужный пункт:");
        System.out.println("1. Сортировка по возрасту");
        System.out.println("2. Сортировка по гендеру");
        System.out.println("3. Сортировка по фамилия");
        System.out.println("4. Сортировка по гендеру и возрасту");
        System.out.println("5. Сортировка по гендеру, возрасту и фамилии");
        System.out.println("6. Добавить новый контакт");
        System.out.println("7. Завершение программы");

        int chM = scan.nextInt();

        if (chM == 1){
            System.out.println("1. Сортировка по возрасту \n");
            outputAge(0);
            printToDisplay();
            choiceMethod();
        }
        else if (chM == 2){
            System.out.println("2. Сортировка по гендеру \n");
            outputMaleOrFemale();
            printToDisplay();
            choiceMethod();
        }
        else if (chM == 3){
            System.out.println("3. Сортировка по фамилия \n");
            outputLastName(0);
            printToDisplay();
            choiceMethod();
        }
        else if (chM == 4){
            System.out.println("4. Сортировка по гендеру и возрасту \n");
            outputMaleOrFemale();
            printToDisplay();
            outputAge(1);
            printToDisplay();
            choiceMethod();
        }
        else if (chM == 5){
            System.out.println("5. Сортировка по гендеру, возрасту и фамилии \n");
            outputMaleOrFemale();
            printToDisplay();
            outputAge(1);
            printToDisplay();
            outputLastName(1);
            printToDisplay();
            choiceMethod();
        }
        else if (chM == 6){
            System.out.println("6. Добавить новый контак \n");
            addNewContact();
        }
        else if (chM == 7){
            System.exit(0);
        }
    }
}
