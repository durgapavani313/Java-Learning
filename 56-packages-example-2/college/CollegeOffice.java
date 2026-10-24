package college;

public class CollegeOffice {
    public void displayStudentMarks() {

        Student s = new Student();

        System.out.println("Public marks: " + s.publicMarks);
        //System.out.println("Private marks: " + s.privateMarks);
        System.out.println("Default marks: " + s.defaultMarks);
        System.out.println("Protected marks: " + s.protectedMarks);
    }
}