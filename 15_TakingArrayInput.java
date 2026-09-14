import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        
        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Array elements are: ");
        for(int i = 0; i < n; i++) {

            System.out.print(numbers[i]  + " ");    
        }
    }
}