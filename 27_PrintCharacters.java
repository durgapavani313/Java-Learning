import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("Characters: ");

        for(int i = 0; i < text.length(); i++) {

            System.out.println(text.charAt(i));
        }
    }
}
