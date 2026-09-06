import java.util.Scanner;

class Main {
    static int square(int n) {
        return n * n; 
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int result = square(number);

        System.out.println("Square = " + result);
    } 
}