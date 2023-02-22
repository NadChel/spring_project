package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println(Arrays.toString(context.getBeanNamesForType(Pet.class)));
        Pet pet = context.getBean("catBean", Pet.class);
//        pet.say();
//        Person person = context.getBean("myPerson", Person.class);
//        person.callYourPet();
        context.close();
    }
}
