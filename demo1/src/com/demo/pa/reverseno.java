package com.demo.pa;

import java.util.Scanner;


public class reverseno {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int n=sc.nextInt();
		sc.close();
		int rev=0;
		while(n!=0) {
			int rem=n%10;
			 rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
	}

}
