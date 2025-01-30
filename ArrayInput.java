import java.util.Scanner; // Import Scanner for user input

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt(); 

        int[] arr = new int[n]; 
        System.out.println("Enter " + n + " elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); 
        }
        System.out.println("Array elements are: ");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}