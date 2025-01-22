package com.mru.methods;

public class Methods {
	public void dsa1() {
		System.out.println("Welcome to DSA1");
	
	}
	public void dsa2(String name) {
		System.out.println(name);
		
	}
	public String dsa3() {
		return "Welcome to leetcode";
	}
	public String dsa4(String name) {
		return "Welcome to "+name;
	}
	public static void main(String[] args) {
		Methods obj  = new Methods();
		obj.dsa1();
		obj.dsa2("MRU");
		String res = obj.dsa3();
		System.out.println(res);
		String res1 = obj.dsa4("CodeChef");
		System.out.println(res1);
	}

}
