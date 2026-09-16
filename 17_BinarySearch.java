import java.util.Scanner;

class BinarySearch {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.print("Enter sorted array elements: ");
        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
            System.out.print("Enter the value to searched: ");
        
        int search = sc.nextInt();

        int index = binarySearch(nums, search);

        if (index != -1) {
            System.out.println("Element foudnd at index position: " + index);
        } else {
            System.out.println("Element not found");
        }
    }


    static int binarySearch(int[] numbers, int search) {

        int left = 0;
        int right = numbers.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(numbers[mid] == search ) {
                return mid;
            }
            else if(numbers[mid] < search ) {
                left = mid + 1;
            } 
            else {
               right = mid - 1; 
            } 
        }
        return -1;
    }
}