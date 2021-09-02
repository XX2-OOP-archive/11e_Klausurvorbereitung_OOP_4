package com.cc.java;


public class App {

	static String value = "Hi";
	
	public static void main(String[] args) {
		
		// KEINE Instanz --> statisch
		Helper.showValue();
		
		// Helperklassen aus JAVA-System
		System.out.println(Math.PI);
		
		// Helper --> Klasse, statisch
		// helper --> Objekt/Instanz (dynamisch)
		
		System.out.println(value);

		
	}

}
