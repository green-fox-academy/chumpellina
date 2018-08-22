public class Student extends Person implements Cloneable {
    String previousOrganisation;
    int skippedDays;

    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganisation = previousOrganization;
        this.skippedDays = 0;
    }

    public Student() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
        this.previousOrganisation = "School of life";
        this.skippedDays = 0;

    }

    public String getGoal() {
        return "Be a junior software developer!";


    }

    public String introduce() {
        return ("Hi, I am " + name + " , a " + age + " year old " + gender + " from " + previousOrganisation + " who skipped " + skippedDays + " from the course already");
    }

    public void skipDays(int x) {
        this.skippedDays = skippedDays + 1;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();

    }

    @Override
    public String toString() {
        return "Student{" +
                "previousOrganisation='" + previousOrganisation + '\'' +
                ", skippedDays=" + skippedDays +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", goal='" + goal + '\'' +
                '}';
    }
}











