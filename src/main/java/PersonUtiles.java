import java.util.List;

public interface PersonUtiles {

    boolean addPerson(Person person);
    boolean deletePerson(Person person);
    boolean findPerson(Person person);
    List<Person> printPersons();

}
