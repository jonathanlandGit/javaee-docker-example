package org.javaee7.sample;

import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Singleton;
import javax.ws.rs.NotFoundException;

@Singleton
public class PersonDatabase {

    List<Person> persons;

    @PostConstruct
    public void init() {
        persons = Arrays.asList(
                new Person("Spiderman"),
                new Person("Hulk"),
                new Person("Iron Man"),
                new Person("Dr. Strange"),
                new Person("Hawkeye"),  
                new Person("Captain America"));
    }

    public Person[] currentList() {
        return persons.toArray(new Person[0]);
    }

    public Person getPerson(int id) {
        if (id < persons.size()) {
            return persons.get(id);
        }

        throw new NotFoundException("Person with id \"" + id + "\" not found.");
    }
}
