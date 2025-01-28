package com.mru.faqs;
import java.util.HashSet;

public class UniqueElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 1, 2, 5};
        
        // Using HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();
        
        // Loop through the array to add elements to the HashSet
        for (int element : arr) {
            set.add(element);  // HashSet will automatically handle uniqueness
        }
        
        // Print the unique elements after the loop
        System.out.println("Unique elements are: ");
        for (int element : set) {
            System.out.println(element);
        }
    }
}
