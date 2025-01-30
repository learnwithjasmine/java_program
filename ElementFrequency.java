import java.util.HashMap;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>(); 
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element frequencies: ");
        for (Integer key : frequencyMap.keySet()) {
            System.out.println(key + " : " + frequencyMap.get(key));
        }
    }
}