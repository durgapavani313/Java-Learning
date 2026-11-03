import java.util.Scanner;

enum Day {
    MONDAY, TUESDAY, WEDNESDAY, 
    THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a day: ");
        String input = sc.nextLine().toUpperCase();

        Day today = Day.valueOf(input);

        System.out.println("Selected day: " + today);

        sc.close();
    }
}

/* Output:
Enter a day: friday
Selected day: FRIDAY */