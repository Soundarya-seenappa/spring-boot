package com.sound;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		int i,m=0,flag=0;
		Scanner s= new Scanner(System.in);
		System.out.println("enter num");
		int n=s.nextInt();
		m=n/2;
		
		if(n==0||n==1) {
			System.out.println(n + "is not a prime");
		}else {
			for(i=2;i<=m;i++) {
				if(n%i ==0) {
					System.out.println(n + "is a prime");
						flag=1;
						break;
				}
			}
			if(flag==0) {
				System.out.println(n+ " is prime number");
			}
		}

	}

}
