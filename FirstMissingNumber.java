import java.util.HashSet;

public class FirstMissingNumber {
    public static int findFirstMissing(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        for (int i = 1; i <= arr.length + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 7, 9, 10};
        System.out.println(findFirstMissing(arr1)); // Output: 6
    }
}
