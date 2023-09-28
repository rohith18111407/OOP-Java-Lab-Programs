import java.util.*;

public class Program2 {
    public static void main(String[] args) {
        // Create two lists of integers
        ArrayList<Integer> alist1 = new ArrayList<Integer>();
        ArrayList<Integer> alist2 = new ArrayList<Integer>();

        // Add some elements to the first list
        alist1.add(10);
        alist1.add(20);
        alist1.add(30);
        alist1.add(40);

        // Add some elements to the second list
        alist2.add(30);
        alist2.add(40);
        alist2.add(50);
        alist2.add(60);

        // Merge the two lists
        ArrayList<Integer> merge = new ArrayList<Integer>(alist1);
        merge.addAll(alist2);
        System.out.println("Merged list: " + merge);

        // Find the union of the two lists
        ArrayList<Integer> union = new ArrayList<Integer>(alist1);
        union.addAll(alist2);
        System.out.println("Union of two lists: " + union);

        // Find the intersection of the two lists
        ArrayList<Integer> intersection = new ArrayList<Integer>(alist1);
        intersection.retainAll(alist2);
        System.out.println("Intersection of two lists: " + intersection);

        // Compare the two lists
        boolean isequal = alist1.equals(alist2);
        System.out.println("Lists are equal: " + isequal);
    }
}
