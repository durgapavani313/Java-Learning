import java.util.Scanner;

class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }
    Student(String name) {
        this.name = name;
        age = 0;
    }
    Student(String name,int age) {
        this.name = name;
        this.age = age; 
    }
    void display() {
        System.out.println("Name = " +name);
        System.out.println("Age = " +age);
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter student age: ");
        int age = sc.nextInt();

        Student s1 = new Student();
        Student s2 = new Student(name);
        Student s3 = new Student(name,age);
        
        System.out.println("\nStudent 1: ");
        s1.display();

        System.out.println("\nStudent 2: ");
        s2.display();

        System.out.println("\nStudent 3: ");
        s3.display();
    }

}