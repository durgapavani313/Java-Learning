import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter array elements: ");
        for(int i= 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.print("Enter the value to search: ");
        int search = sc.nextInt();

        boolean found = false;

        for(int i= 0; i < n; i++) {
            
            if(numbers[i] == search) {
                System.out.println("Value found at index"+i);
                found = true;
                break;
            }
        }
        if(found == false) {
            System.out.println("Value not found");
        }
    }
}
