import java.util.Scanner;

class Branch {
    String branchName;

    Branch(String branchName) {
        this.branchName = branchName;
    } 
}
class Student {
    String studentName;
    int rollNo;
    Branch branch;

    Student(String studentName, int rollNo, Branch branch) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.branch = branch;
    }
    void display() {

        System.out.println("\nStudent Name = " + studentName);

        System.out.println("Roll Number = " + rollNo);

        System.out.println("Branch = " + branch.branchName);
    } 
}
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter branch: ");
        String branchName = sc.nextLine();

        Branch b = new Branch(branchName);

        Student s = new Student(name,roll,b);

        s.display();
    }
}