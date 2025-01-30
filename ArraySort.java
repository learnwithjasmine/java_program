import java.util.Arrays; 

public class ArraySort {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3, 7}; 

        Arrays.sort(arr); 

     
        System.out.println("Sorted Array: ");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
