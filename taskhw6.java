package HomeWork.HomeWork6;

import java.util.*;
 
public class taskhw6{
      
    public static void main(String[] args) {
        
        // 1. Объявить и инициализировать экземпляр класса HashSet. Обобщение String.
        HashSet<String> hs_elements = new HashSet<String>();
          
        // 2. Добавить пять элементов в множество.
        hs_elements.add("Hydrogenium");
        hs_elements.add("Helium");
        hs_elements.add("Lithium");
        hs_elements.add("Beryllium");
        hs_elements.add("Borum");        
        System.out.println(hs_elements);

        // 3. Отсортировать значения используя итератор.
        // 4. Отсортированный результат сохранить в LinkedHashSet
        LinkedHashSet<String> lhs_elements = new LinkedHashSet<>();
        Iterator<String> it = hs_elements.iterator();
        ArrayList<String> ar = new ArrayList();
        while (it.hasNext()){
            ar.add(it.next());
        }        
        Collections.sort(ar);
        for (int i = 0; i < ar.size(); i++) {
            lhs_elements.add(ar.get(i));
        }
        System.out.println(lhs_elements);

        // 5. Создать TreeSet с компаратором.
        // 6. Скопировать содержимое первого множества (HashSet) в TreeSet.
        // 7. *Скорректировать компаратор так, чтобы поля хранились в обратном порядке.
        TreeSet<String> ts_elements = new TreeSet<>(new Comparator<String>() {
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) { return 0;}
                if (o1.compareTo(o2) < 0) {return 1;}
                else return -1;
            }
        });

        ts_elements.addAll(hs_elements);
        System.out.println(ts_elements);
    }
}