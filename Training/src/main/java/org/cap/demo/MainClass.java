package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		SalesClass salesClass = new SalesClass();
		salesClass.display();
		greetings();
	}
	
	public static void greetings(){
		System.out.println("Hello");
	}
}
