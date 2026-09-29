import java.util.Scanner;

class Employee {
    String name;
    int salary;

    void displayDetails() {

        System.out.println("Employee name: " +name);
        System.out.println("Employee salary: " +salary);
    }
}
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee e1 = new Employee();

        System.out.print("Enter employee name: ");
        e1.name = sc.nextLine();

        System.out.print("Enter employee salary: ");
        e1.salary = sc.nextInt();
        
        e1.displayDetails();
    }
}
