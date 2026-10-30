import java.util.Scanner;

class Student {
    String name;
    static String college;

    Student(String name) {
        this.name = name;
    }

    static void displayCollege() {
        System.out.println("College: " + college);
    }

    void displayStudent() {
        System.out.println("Student Name: " + name);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter college name: ");
        Student.college = sc.nextLine();

        System.out.print("Enter student 1 name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter student 2 name: ");
        String name2 = sc.nextLine();

        Student s1 = new Student(name1);
        Student s2 = new Student(name2);

        System.out.println("\n--- Student Details ---");

        Student.displayCollege();
        s1.displayStudent();
        s2.displayStudent();

        sc.close();
    }
}