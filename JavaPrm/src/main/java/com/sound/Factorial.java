package com.sound;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		int i,fact=1;
		Scanner sacnner = new Scanner(System.in);
		System.out.println("enter the num");
		int number=sacnner.nextInt();
		for(i=1;i<number;i++) {
			fact=fact*i;
		}
		System.out.println("factorial "+ number  +"is :"+fact);
		
		

	}

}
