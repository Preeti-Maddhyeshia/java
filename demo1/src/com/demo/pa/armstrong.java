package com.demo.pa;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		sc.close();
		int rem,res=0;
	   int temp=n;
		while(n>0) {
			 rem=n%10;
			 res=res+rem*rem*rem;
			 n=n/10;
		}
		if(temp==res)
			System.out.println("number is armstrong");
		else 
			System.out.println("not armstrong");
		
		

	}

}
