package sports;

import college.Student;

public class SportsStudent extends Student {
    public void displayMarks() {

        System.out.println("Public marks: " + publicMarks);
        System.out.println("Protected marks: " + protectedMarks);
        //System.out.println("Default marks: " + defaultMarks);
        //System.out.println("Private marks: " + privateMarks);
    }
}