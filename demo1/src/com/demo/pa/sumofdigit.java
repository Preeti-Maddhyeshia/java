package com.demo.pa;

import java.util.Scanner;

public class sumofdigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int n=sc.nextInt();
		sc.close();
		int result=0;
		while(n!=0) {
			int r=n%10;
			result=result+r;
			n=n/10;
		}
		System.out.println(result);

	}

}
