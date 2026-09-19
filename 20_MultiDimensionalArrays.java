import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of layers: ");
        int layers = sc.nextInt();

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int columns = sc.nextInt();

        int[][][] numbers = new int[layers][rows][columns];

        System.out.println("Enter array elements: ");
        for(int i = 0; i < layers; i++) {
            System.out.println("Layer" + i +":");
            for(int j = 0; j < rows; j++) {
                for(int k = 0; k < columns; k++) {
                numbers[i][j][k] = sc.nextInt(); 
                }
            }  
        }
        System.out.println("3D Array is: ");
        for(int i = 0; i < layers; i++) {
            System.out.println("Layer" + i +":");
            for(int j = 0; j < rows; j++) {
              for(int k = 0; k < columns; k++) 
            System.out.print(numbers[i][j][k] + " ");
            System.out.println();
           }
        }
        System.out.println();
    }
}
