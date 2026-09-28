import java.util.Scanner;

class Student {
    String name;

    void display() {

        System.out.println("Student Name: " + name);
    }    
}
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        System.out.print("Enter student name: ");
        s1.name = sc.nextLine();

        s1.display();
    }

} 
 

