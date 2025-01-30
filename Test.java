// abstract class shape {
//     shape() {
//         System.out.println("shape constructor");
//     }

//     abstract void print();
// }

// class circle extends shape {
//     void print() {
//         System.out.println("circle draw");
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         shape obj = new circle();
//         obj.print();
//     }
// }

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
     
        ArrayList<String> names = new ArrayList<>();
        names.add("jas");
        names.add("Dillu");
        names.add("Yasu");
        names.add("Shabbu");
        names.add("Aman");

       
        System.out.println("Original List:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // Update the second element in the list
        names.set(1, "Brian");
        System.out.println("\nAfter Updating 2nd Element:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // Remove the third element from the list
        names.remove(2);
        System.out.println("\nAfter Removing 3rd Element:");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        // Search for an element in the list
        String searchName = "Shabbu";
        boolean found = false;
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals(searchName)) {
                System.out.println("\n" + searchName + " found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\n" + searchName + " not found.");
        }

        // Display the size of the list
        System.out.println("\nTotal Elements in List: " + names.size());

        // Print the reverse of the ArrayList
        System.out.println("\nReverse of the List:");
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));
        }

        // Remove duplicates from ArrayList
        ArrayList<String> uniqueNames = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            if (!uniqueNames.contains(names.get(i))) {
                uniqueNames.add(names.get(i));
            }
        }
        System.out.println("\nList after Removing Duplicates:");
        for (int i = 0; i < uniqueNames.size(); i++) {
            System.out.println(uniqueNames.get(i));
        }

        // Print element at a given index
        int index = 2;
        if (index >= 0 && index < names.size()) {
            System.out.println("\nElement at index " + index + ": " + names.get(index));
        } else {
            System.out.println("\nIndex out of bounds!");
        }

        // Find the smallest and largest element in the list
        String smallest = names.get(0);
        String largest = names.get(0);
        for (int i = 1; i < names.size(); i++) {
            if (names.get(i).compareTo(smallest) < 0) {
                smallest = names.get(i);
            }
            if (names.get(i).compareTo(largest) > 0) {
                largest = names.get(i);
            }
        }
        System.out.println("\nSmallest Element: " + smallest);
        System.out.println("Largest Element: " + largest);
    }
}