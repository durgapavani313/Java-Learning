import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("\nOriginal String: " + text);
        String result1 = text.toUpperCase();
        System.out.println("Original after toUpperCase(): " + text);
        System.out.println("New string: " + result1);

        String result2 = text.concat(" Java");
        System.out.println("Original after concat(): " + text);
        System.out.println("New string: " + result2);

        text = result2;
        System.out.println("After assigning new string: " + text);
    }
}
