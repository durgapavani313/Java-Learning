import college.Student;
import college.CollegeOffice;
import sports.SportsStudent;

public class Main {
    public static void main(String[] args) {

        System.out.println("--- Same Package Access ---");
        CollegeOffice office = new CollegeOffice();
        office.displayStudentMarks();

        System.out.println("\n--- Cross-Package Inheritance ---");
        SportsStudent athlete = new SportsStudent();
        athlete.displayMarks();

        System.out.println("\n--- Public Access ---");
        Student student = new Student();
        System.out.println("Public marks: " + student.publicMarks);



    }
}