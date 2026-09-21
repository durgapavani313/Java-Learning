import java.util.Scanner;

class Student {
    String name;
    int age;
    int totalMarks;
}

class ArrayOfObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int number = sc.nextInt();
        Student[] students = new Student[number];

        for(int i = 0; i < number; i++) {
            Student s1 = new Student();
            System.out.print("Enter student " +(i+1)+" name: ");
            s1.name = sc.next();
            System.out.print("Enter student " +(i+1)+" age: ");
            s1.age = sc.nextInt();
            System.out.print("Enter student " +(i+1)+" total marks: ");
            s1.totalMarks = sc.nextInt();  
            students[i] = s1;
        }

        System.out.println();
        System.out.println("Printing Students");
        System.out.println("Name - Age - Marks");
        for(Student s1:students) {
            System.out.println(s1.name +" - " +s1.age +" - " +s1.totalMarks);
        }  
    }
}