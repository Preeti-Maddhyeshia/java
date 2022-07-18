package com.demo.pa;

import java.util.Scanner;

public class armstrong1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		sc.close();
		int num,res=0;
for(int i=1;i<=n;i++) {
	 num=i;
	 while(num>0) {
		
		 int rem=num%10;
		 res=res+rem*rem*rem;
		 num=num/10;
	 }
	 if(i==res) {
		 System.out.println("no is armstrong:"+i);
	 }
	 res=0;
	}

	}
}
