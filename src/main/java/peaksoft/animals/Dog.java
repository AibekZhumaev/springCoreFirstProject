package peaksoft.animals;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Zha_Aibek@mail.com
 */
@Component
public class Dog implements Animal {
    private String name;
    private String Color;
    private String species;
    private int age;

    public Dog(String name, String color, String species, int age) {
        this.name = name;
        this.Color = color;
        this.species = species;
        this.age = age;
    }

    public Dog() {
    }

    public String getName() {
        return name;
    }

    @Value("Dog.name")
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return Color;
    }

    @Value("${Dog.color}")
    public void setColor(String color) {
        Color = color;
    }

    public String getSpecies() {
        return species;
    }

    @Value("${Dog.species}")
    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    @Value("${Dog.age}")
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", Color='" + Color + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void animalPlus() {

    }

    @Override
    public void animalMinus() {

    }
}
