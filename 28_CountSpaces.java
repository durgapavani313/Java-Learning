import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String text = sc.nextLine();

        int count = 0;

        for(int i = 0; i < text.length(); i++) {
            
            if(text.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Number of spaces = " +count);
    }
}