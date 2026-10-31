import java.util.Scanner;

class Student {

    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        Student s2 = new Student();

        System.out.print("Enter first student name: ");
        s1.name = sc.nextLine();

        System.out.print("Enter first student age: ");
        s1.age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter second student name: ");
        s2.name = sc.nextLine();

        System.out.print("Enter second student age: ");
        s2.age = sc.nextInt();

        System.out.println("\n--- Student Details ---");
        s1.display();
        s2.display();

        sc.close();

        /* Output: 
        Enter first student name: Durga
        Enter first student age: 17
        Enter second student name: Pavani
        Enter second student age: 18

        --- Student Details ---
        Name: Durga
        Age: 17
        Name: Pavani
        Age: 18 */
    }
}