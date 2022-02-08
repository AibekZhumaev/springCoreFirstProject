package peaksoft.animals;

import org.springframework.stereotype.Component;

/**
 * @author Zha_Aibek@mail.com
 */
@Component
public class Cat implements Animal {
    private String name;
    private String Color;
    private String species;
    private int age;

    public Cat(String name, String color, String species, int age) {
        this.name = name;
        this.Color = color;
        this.species = species;
        this.age = age;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
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
