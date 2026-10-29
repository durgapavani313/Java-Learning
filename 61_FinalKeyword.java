class Student {
    final int rollNumber = 101;

    final void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Student details displayed.");
    }
}
class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

        //s1.rollNumber = 102; // Error: cannot change final variable
    }
}