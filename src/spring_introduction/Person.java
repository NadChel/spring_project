package spring_introduction;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private Pet pet;
    private String firstName;
    private String lastName;
    private int age;

    public Person() {
    }

    public Person(Pet pet) {
        this.pet = pet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Pet getPet() {
        return pet;
    }

    public void callYourPet() {
        System.out.println("Hello, my pet!");
        pet.say();
    }

    public void init() {
        System.out.println("Person: Initialization method");
    }

    public void destroy() {
        System.out.println("Person: Destroy method");
    }
}
