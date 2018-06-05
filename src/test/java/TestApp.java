import org.junit.*;

public class TestApp {

    private PersonUtiles personUtiles;

    @Before
    public void beginTest(){
        personUtiles = new PersonUtilesImpl();
        Person p1 = new Person("Nazar",35);
        Person p2 = new Person("Kolya",34);
        Person p3 = new Person("Olya",51);
        Person p4 = new Person("Kostya",41);
        Person p5 = new Person("Andy",40);
        Person p6 = new Person("Igor",42);
        Person p7 = new Person("Lesya",38);
        personUtiles.addPerson(p1);
        personUtiles.addPerson(p2);
        personUtiles.addPerson(p3);
        personUtiles.addPerson(p4);
        personUtiles.addPerson(p5);
        personUtiles.addPerson(p6);
        personUtiles.addPerson(p7);
    }

    @After
    public void endTest(){
        personUtiles = null;
    }

    @Test
    public void addPerson() {

        Assert.assertTrue(personUtiles.addPerson(new Person("Valeryi", 32)));

    }

    @Test
    public void deletePerson() {

        Assert.assertEquals(new Person("Kolya", 34),
                personUtiles.deletePerson(new Person("Kolya", 34)) ?
                        new Person("Kolya", 34) : null);
    }

    @Test
    public void findPerson() {

        Assert.assertTrue(personUtiles.findPerson(new Person("Nazar",35)));

    }

    @Test
    public void printPersons() {

        Assert.assertEquals(7,personUtiles.printPersons().size());

    }

}