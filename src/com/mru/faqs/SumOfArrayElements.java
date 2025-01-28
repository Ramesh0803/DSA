package com.mru.faqs;
public class SumOfArrayElements {
    public static void main(String[] args) {
        // Initialize the array
        int arr[] = {1, 2, 3, 4, 5};
        
        // Variable to store the sum
        int sum = 0;
        
        // Loop through the array and sum the elements
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];  // Add each element to sum
        }
        
        // Output the sum of array elements
        System.out.println("Sum of array elements: " + sum);
    }
}
