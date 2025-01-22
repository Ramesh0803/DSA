package com.mru.loops;

public class loops {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int e1 = arr[0];
		System.out.println(e1);
		
		int e2 = arr[1];
		System.out.println(e2);
		
		int e3 = arr[4];
		System.out.println(e3);
		
		int n = arr.length;
		System.out.println(n);

		//for loop
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}
		
		//while loop
		int x = 0;
		while(x<n) {
			System.out.println(arr[x]);
			x++;
		}
		
		//do while loop
		int y = 0;
		do {
			System.out.println(arr[y]);
			y++;
		}while(y<n);
		
	}

}
