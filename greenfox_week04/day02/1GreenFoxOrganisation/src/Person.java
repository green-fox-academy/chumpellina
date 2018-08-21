public class Person {
    String name;
    int age;
    String gender;
    String goal;

    public Person(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    }

    public Person() {
        String name = "Jane Doe";
        Integer age = 30;
        String gender = "female";
    }

    public String introduce() {
        this.name = name;
        this.age = age;
        this.gender = gender;
        return "Hi, I am " + name + " , a " + age + " year old " + gender;
    }

    public String getGoal() {
        return "My goal is: Live for the moment!";
    }

}






  /*  Create a Person class with the following fields:

        name: the name of the person
        age: the age of the person (whole number)
        gender: the gender of the person (male / female)
        And the following methods:

        introduce(): prints out "Hi, I'm name, a age year old gender."
        getGoal(): prints out "

        And the following constructors:

        Person(name, age, gender)
        Person(): sets name to Jane Doe, age to 30, gender to female */