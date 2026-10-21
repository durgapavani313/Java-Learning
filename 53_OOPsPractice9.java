/*
9. College Management
Intermediate
Concepts: Multiple classes, object relationships, encapsulation

Requirements:
- Create a class named College with collegeName and location.
- Create a class named Student with name and rollNumber.
- Each student should have a reference to their College object.
- Create at least two students associated with the same college.
- Display each student's information along with the college details.
Goal: Understand how objects can be connected to other objects.
*/

class College {
    String collegeName;
    String location;

    College(String collegeName, String location) {
        this.collegeName = collegeName;
        this.location = location;
    }
}

class Student {
    String name;
    String rollNumber;
    College college;

    Student(String name, String rollNumber, College college) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.college = college;
    }
    public void displayDetails() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Roll Number: " + this.rollNumber);
        System.out.println("College Name: " + this.college.collegeName);
        System.out.println("Location: " + this.college.location);
        System.out.println();
    }
}

class Main {
    public static void main(String[] args) {

        College c1 = new College("ABC College", "Hyderabad");

        Student s1 = new Student("Durga", "101", c1);
        Student s2 = new Student("Pavani", "102", c1);

        s1.displayDetails();
        s2.displayDetails();
    }
}