package com.demo.pa;


import java.util.Scanner;

public class pailndrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
				System.out.println("enter number");
		int n=sc.nextInt();
		sc.close();
		int rev=0;
		int temp=n;
		while(n!=0) {
			 
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
			
		}
		if(temp==rev) 
			System.out.println("number is palindrome");
		
		else
			System.out.println("not palindrome");
	}

}
