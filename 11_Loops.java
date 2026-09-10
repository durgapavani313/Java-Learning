import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==========LOOPS==========");

        //1.FOR LOOP
        System.out.println("FOR LOOP");

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
        System.out.println(i);
        }

        //2.WHILE LOOP
        System.out.println("WHILE LOOP");
        int i = 1;
        while(i <= n) {
            System.out.println(i);
            i++;
        }
        
        //3.DO-WHILE LOOP
        System.out.println("DO-WHILE LOOP");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while(j <= n);
        
        //4.FOR-EACH LOOP
        System.out.println("FOR-EACH LOOP");
        int[] numbers ={1,2,3,4,5};
        for(int number : numbers) {
            System.out.println(number);
        }
    }
}
