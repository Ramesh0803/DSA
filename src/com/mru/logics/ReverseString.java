package com.mru.logics;

public class ReverseString {
	public static void main(String[] args) {
		String str = "Ramesh";	
		char[] arr = new char[str.length()];
		for(int i=0; i<str.length();i++) {
		 arr[i] = str.charAt(i); 
		}		
		int start=0, end = arr.length-1;		
		while (start<end ) {
			char temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}		
		String rev = new String(arr);
		System.out.println(str);
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
	}
}

