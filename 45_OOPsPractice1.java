/*
1. Student Details
Beginner
Concepts: Class, object, fields, methods
Requirements:
- Create a class named Student.
- Declare fields: name, rollNumber, and marks.
- Create a method displayDetails() to print all student details.
- In the main() method, create two Student objects with different values.
- Call displayDetails() for both objects.
Goal: Understand how classes act as blueprints for objects.
*/

class Student {
    String name;
    int rollNumber;
    double marks;

    public void displayDetails() {

        System.out.println("Roll Number : " + this.rollNumber + " | Name : " + this.name + " | Marks : " + this.marks);
    }
}
class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Student-1";
        s1.rollNumber = 1;
        s1.marks = 90;

        Student s2 = new Student();
        s2.name = "Student-2";
        s2.rollNumber = 2;
        s2.marks = 80;

        s1.displayDetails();
        s2.displayDetails();
    }
}