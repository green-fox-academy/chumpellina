public class Mentor extends Person {
    String level;

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
        return;
    }

    public Mentor() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.level = "intermediate";
    }


    public String getGoal() {
        return "Educate brilliant junior software developers.";
    }

    public String introduce() {

        return "Hi, I am " + name + " , an" + age + " years old" + gender + level + " mentor";
    }

}

