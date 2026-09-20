import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        int[][] numbers = new int[rows][];

        for(int i = 0; i < rows; i++) {
            System.out.print("Enter number of elements in row " + i  +" : ");
            int columns = sc.nextInt();
            numbers[i] = new int[columns];

            System.out.println("Enter elements of row " + i  +" : ");
            for(int j = 0; j < columns; j++) {
            numbers[i][j] = sc.nextInt();    
            }
        }
        System.out.println("Jagged Array is: ");
        for(int i = 0; i < numbers.length; i++) { 
            for(int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] +" ");
            }
        System.out.println();   
        }
    }
}
