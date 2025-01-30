import java.util.*;

public class duplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2, 3, 4, 5, 6};

        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new LinkedHashSet<>();

        for (int num : arr) {
            if (seen.contains(num))
             {
                duplicates.add(num);
            } else {
                seen.add(num);
            }
        }

        System.out.println("Duplicates in order: ");
        for (int dup : duplicates) {
            System.out.print(dup + " ");
        }
    }
}