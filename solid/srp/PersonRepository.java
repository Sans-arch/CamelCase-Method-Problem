package solid.srp;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    private List<Person> fakeDB = new ArrayList<>();
    
    public List<Person> getPeople() {
        // buscar na database...
        List<Person> peopleReturnedFromDB = new ArrayList<>();
        Person p1 = new Person(32, "Carlos", 80.0, 1.83);
        Person p2 = new Person(35, "Maria", 72.45, 1.65);
        peopleReturnedFromDB.add(p1);
        peopleReturnedFromDB.add(p2);
        return peopleReturnedFromDB;
    }

    public Person getPerson(String name) {
        // busca uma pessoa no database, ... SELECT, WHERE...
        Person personFound = new Person(32, name, 1.71, 65.3);
        return personFound;
    }

    public void addPerson(Person person) {
        fakeDB.add(person);
    }
}
