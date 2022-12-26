import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Антуан", "де Сент-Экзюпери", 43));
        people.add(new Person("Михаил", "Салтыков-Щедрин" , 76));
        people.add(new Person("Петр", "Семенов-Тян-Шаньский", 89));
        people.add(new Person("Лев", "Толстой", 45));
        people.add(new Person("Николай", "Костер-Вальдау", 45));
        System.out.println(people);
        Comparator<Person> comparator = (Person o1, Person o2) -> {
            String[] sur1 = o1.getSurname().split("\\P{IsAlphabetic}+");
            String[] sur2 = o2.getSurname().split("\\P{IsAlphabetic}+");
            int result = (sur1.length >= 2 && sur2.length >= 2) ? 0 : Integer.compare(sur1.length, sur2.length);
            return result == 0 ? o1.compareTo(o2) : result;
        };
        Collections.sort(people, comparator);
        System.out.println(people);
    }
}