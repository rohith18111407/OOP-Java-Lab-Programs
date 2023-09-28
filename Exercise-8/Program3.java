import java.util.*;
import java.util.stream.Collectors;

public class Program3 {
    public static void main(String[] args) {
        // Create a new doubly linked list of integers
        LinkedList<Integer> alist = new LinkedList<>();
        alist.add(10);
        alist.add(20);
        alist.add(30);
        alist.add(40);
        alist.add(50);
        alist.add(60);
        System.out.println("List at the begin: " + alist);

        // Insert some elements on both sides of the list
        System.out.println("Adding element 70 and element 80 to first and last respectively");

        alist.addFirst(70);
        alist.addLast(80);

        System.out.println("List after adding elements at first and last: " + alist);

        // Delete some elements from both sides of the list
        System.out.println("Removing the first and last element");

        alist.removeFirst();
        alist.removeLast();
        System.out.println("List after removing first and last: " + alist);

        // Insert an element at a particular position in the list
        System.out.println("Inserting element 90 in the third index");
        alist.add(3, 90);
        System.out.println("After adding element 90 in 3rd index: " + alist);

        // Delete a particular element from the list
        System.out.println("Deleting element 70 in the DoublyLinkedlist");
        alist.remove(3);
        System.out.println("After removing 70: " + alist);

        // Search for a particular element in the list
        System.out.println("Searching for element 20 in the DoublyLinkedlist and printing its index");

        int ind = alist.indexOf(20);
        System.out.println("Element 20 is found at index: " + ind);

        // Display the list in forward and backward order
        System.out.println("Printing in Forward and backward order");

        System.out.println("Forward order: " + alist);
        System.out.println("Backward order: " + reverse(alist));

        // Sort the elements in the list
        System.out.println("Soring the DoublyLinkedlist ");
        alist.sort(null);
        System.out.println("Sorted list: " + alist);

        // Replace an element in the list with another element
        System.out.println("Replacing element at index 3 in the DoubblyLinkedlist with 100");
        alist.set(3, 100);
        System.out.println("List with replacement: " + alist);

        // Remove duplicate elements from the list
        System.out.println("Removing the duplicate elements in the DoublyLinkedlist");

        alist = (LinkedList<Integer>) removeDuplicate(alist);
        System.out.println("List without duplicates: " + alist);
    }

    // Helper method for reversing the elements in a list
    public static <T> LinkedList<T> reverse(LinkedList<T> alist) {
        LinkedList<T> reversed = new LinkedList<T>();
        for (int i = alist.size() - 1; i >= 0; i--) {
            reversed.add(alist.get(i));
        }
        return reversed;
    }

    public static <T> LinkedList<T> removeDuplicate(LinkedList<T> alist) {
        for (int i = 0; i < alist.size(); i++) {
            for (int j = i + 1; j < alist.size(); j++) {
                if (alist.get(i).equals(alist.get(j))) {
                    alist.remove(j);
                }
            }
        }
        return alist;
    }
}
