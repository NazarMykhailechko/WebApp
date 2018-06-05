import java.util.ArrayList;
import java.util.List;

public class PersonUtilesImpl implements PersonUtiles {

    private List<Person> personList;

    PersonUtilesImpl() {
        personList = new ArrayList<Person>();
    }

    public boolean addPerson(Person person) {
        personList.add(person);
        return personList.contains(person);
    }

    public boolean deletePerson(Person person) {
        personList.remove(person);
        return !personList.contains(person);
    }

    public boolean findPerson(Person person) {
        return personList.contains(person);
    }

    public List<Person> printPersons() {
        return personList;
    }
}
