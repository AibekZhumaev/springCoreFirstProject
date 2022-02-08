package peaksoft.person;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import peaksoft.animals.Animal;

/**
 * @author Zha_Aibek@mail.com
 */
@Component
public class Person {
    private Animal animal;

    private String name;
    private String surname;
    private int age;

    public Person(Animal animal) {
        this.animal = animal;
    }

    public Person(Animal animal, String name, String surname, int age) {
        this.animal = animal;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person() {
    }

    public Animal getAnimal() {
        return animal;
    }

    @Autowired
    @Qualifier("dog")
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }

    @Value("${Person.name}")
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    @Value("${Person.surname}")
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    @Value("${Person.age}")
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "animal=" + animal +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
