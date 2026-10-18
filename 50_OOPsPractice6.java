/*
6. Employee Salary
Easy–Intermediate
Concepts: Classes, constructors, methods, encapsulation
Requirements:
- Create a class named Employee.
- Include employeeId, name, and basicSalary.
- Initialize the fields through a constructor.
- Create a method calculateAnnualSalary().
- Create a method displayEmployeeDetails().
- Ensure salary values cannot be negative.
Goal: Combine constructors, object data, and calculations.
*/ 

class Employee {
    private String employeeId;
    private String name;
    private double basicSalary;

    Employee(String employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        setSalary(basicSalary);
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
         if(salary >=0) {
            this.basicSalary = salary;
         } else {
            System.out.println("Salary cannot be negative");
         }      
    }

    public double calculateAnnualSalary() {
        return basicSalary * 12;
    }

    public void displayEmployeeDetails() {
        System.out.println("EmployeeId: " + this.employeeId);
        System.out.println("Name: " + this.name);
        System.out.println("Basic Salary: " + this.basicSalary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }
}

class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("26A81A05E5", "Pavani", 100000);

        e1.displayEmployeeDetails();
    }
}

