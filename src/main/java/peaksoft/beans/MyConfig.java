package peaksoft.beans;

import org.springframework.context.annotation.PropertySource;
import peaksoft.animals.Cat;
import peaksoft.animals.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import peaksoft.person.Person;


/**
 * @author Zha_Aibek@mail.com
 */
@Configuration
@ComponentScan(basePackages = "peaksoft")
@PropertySource("classpath:application.properties")
public class MyConfig {
    @Bean
    public Dog getDog() {
        return new Dog();
    }
    @Bean
    public Cat getCat(){
        return new Cat();
    }

    @Bean
    public Person getPerson() {
        return new Person();
    }
}
