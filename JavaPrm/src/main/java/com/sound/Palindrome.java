package com.sound;

import java.util.Scanner;

public class Palindrome {

		 public static void main(String[] args) {
		        int r, sum=0, temp;
		        Scanner scan = new Scanner(System.in);
		        System.out.println("Enter the number");
		        int n = scan.nextInt();
		        
		        
		        temp = n;
		        while(n>0) {
		            r=n%10;
		            sum=(sum*10)+r;
		            n=n/10;
		        }
		        
		        if(temp==sum)
		                System.out.println(" is a paliondrome");
		        else {
		            System.out.println(" is not a paliondrome");
		        }

		 

		    }
	}


