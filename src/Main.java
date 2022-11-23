import java.util.ArrayList;
import java.util.Collections;
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
        Collections.sort(people, new PersonsSurnameLengthComparator());
        System.out.println(people);
    }
}