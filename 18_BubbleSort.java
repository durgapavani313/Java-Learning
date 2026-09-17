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
        //sorting
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - 1 - i; j++) {

                if(numbers[j] > numbers[j + 1]) {

                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                 }
               }
            }
            System.out.println("Sorted array: ");   
            for(int i = 0; i < n; i++) {
                System.out.print(numbers[i] +" ");
            }
        }
    }
 
 
