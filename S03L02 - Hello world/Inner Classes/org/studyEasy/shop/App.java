package org.studyEasy.shop;

import java.util.LinkedList;
import java.util.Scanner;


public class App {

	interface Lambda{
		public void demo();
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name >>>> ");
		String name = sc.nextLine();
		Lambda lambda = ()->System.out.println("You name is " + name);
	
	lambda.demo();
	
	Thread thread = new Thread (()-> System.out.println("Home"));
		
		
	thread.start();
	
	

}}