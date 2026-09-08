import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        //if-else statement
        System.out.println("==========if-else statement==========");
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        if(number %2 ==0) {
            System.out.println("Even number");
        }
        else {
            System.out.println("Odd number");
        }

        //else-if ladder statement
        System.out.println("==========else-if ladder statement==========");
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        if (marks >= 90) {
            System.out.println("Grade A");
        }
        else if (marks >= 75) {
            System.out.println("Grade B");
        }
        else if (marks >= 40) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Fail");
        }

        //Nested if statement
        System.out.println("==========Nested if statement==========");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your ID: ");
        int ID = sc.nextInt();
        if(age >= 18) {
            if(ID > 0) {
                 System.out.println("Entry allowed");
            }
            else {
                System.out.println("Invalid ID");
            }
        }
        else {
            System.out.println("Not eligible");
        }

        //switch statement
        System.out.println("==========Switch statement==========");
        System.out.print("Enter day number (1-3): ");
        int day = sc.nextInt();
        switch (day) {

            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;
            
            case 3:
            System.out.println("Wednesday");
            break;

            default:
            System.out.println("Invalid day");
        }
    }
}
