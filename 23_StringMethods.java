import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Length: "+text.length());

        System.out.print("Enter a word to check: ");
        String word = sc.nextLine();

        System.out.println("Contains: "+text.contains(word));
        System.out.println("Starts with: "+ text.startsWith(word));
        System.out.println("Ends with: "+ text.endsWith(word));

        System.out.print("Enter another string: ");
        String another = sc.nextLine();
        System.out.println("Strings are equal: "+text.equals(another));

        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
    }
}
