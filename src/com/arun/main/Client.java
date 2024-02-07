package com.arun.main;

import java.util.Scanner;

public class Client {
	
	
	public static void main(String args[])
	{
		System.out.println("What are you Lokking for");
		
		Scanner sc=new Scanner(System.in);
		
		String input=sc.next();
		
		FurnitureFactory factory=FurnitureFactory.getFactory(input);
		Chair ch=factory.createChair();
		ch.sit();
		
	}
}
