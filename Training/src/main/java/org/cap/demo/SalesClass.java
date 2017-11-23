package org.cap.demo;

public class SalesClass {

	int arr[] = {1,2,3};
	
	public void display(){
		System.out.println("Elements");
		for(int i :arr){
			System.out.println(i);
		}
	}
	
	public void displaySimple(){
		System.out.println("Simple display");
		System.out.println("Hi Simple Display");
		System.out.println("Added after merge");
	}
}
