import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Антуан", "де Сент-Экзюпери", 43));
        people.add(new Person("Михаил", "Салтыков-Щедрин" , 76));
        people.add(new Person("Петр", "Семенов-Тян-Шаньский", 89));
        people.add(new Person("Лев", "Толстой", 45));
        people.add(new Person("Николай", "Костер-Вальдау", 45));
        people.add(new Person("Алексей", "Селезнёв", 15));
        people.add(new Person("Валерий", "Шестаков-Федоров", 17));
        System.out.println(people);

        Predicate<Person> predicate = (person) -> (person.getAge() < 18) ? true : false ;
        people.removeIf(predicate);
        System.out.println();
        System.out.println("Удалены люди младше 18 лет: " + people);


        Collections.sort(people, new PersonsSurnameLengthComparator());
        System.out.println(people);
    }
}