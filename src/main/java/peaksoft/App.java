package peaksoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import peaksoft.beans.MyConfig;
import peaksoft.person.Person;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("getPerson", Person.class);
        System.out.println(person);

        context.close();
    }
}
