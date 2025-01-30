import java.util.HashSet;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5}; 
        int[] arr2 = {3, 4, 5, 6, 7}; 

        HashSet<Integer> set1 = new HashSet<>(); 
        for (int num : arr1) {
            set1.add(num); 
        }

    
        System.out.println("Intersection of arrays: ");
        for (int num : arr2) {
            if (set1.contains(num)) {
                System.out.println(num); 
            }
        }
    }
}