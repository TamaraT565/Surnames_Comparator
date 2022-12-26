import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PersonsSurnameLengthComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        int numbersur1,numbersur2;
        String[] currentSurname1 = o1.getSurname().split("\\P{IsAlphabetic}+");
        String[] currentSurname2 = o2.getSurname().split("\\P{IsAlphabetic}+");
        numbersur1 = currentSurname1.length;
        numbersur2 = currentSurname2.length;
        if (numbersur1 == numbersur2) {
            return o2.getAge() - o1.getAge();
        } else {
            return numbersur2 - numbersur1;
        }
    }
}
