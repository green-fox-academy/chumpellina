import java.util.ArrayList;

public class Cohort {
    String name;
    ArrayList <Student> studentList= new ArrayList<>();
    ArrayList <Mentor> mentorList = new ArrayList<>();

    public Cohort (String name) {
        this.name = name;

    }

    public void addStudent (Student x) {
        studentList.add(x);
    }

    public void addMentor (Mentor x) {
        mentorList.add(x);
    }

    public String info () {
        return "The " + name + " cohort has " + studentList.size() + "  students and " + mentorList.size()+ " mentors.";
    }
}


/* Create a Cohort class that has the following

fields:
name: the name of the cohort
students: a list of Students
mentors: a list of Mentors
methods:
addStudent(Student): adds the given Student to students list
addMentor(Mentor): adds the given Mentor to mentors list
info(): prints out "The name cohort has students.size() students and mentors.size() mentors."
The Cohort class has the following constructors:

Cohort(name): beside the given parameter, it sets students and mentors as empty lists */
