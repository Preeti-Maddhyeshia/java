package com.demo.pa;
import java.util .Scanner;
public class airthmetic {
	int a,b;
	void add(int a,int b) {
		int sum=a+b;
		System.out.println("addition:"+sum);
	}
	void sub(int a ,int b) {
		int sub=a-b;
		System.out.println("subtract:"+sub);
	}
	void mul(int a, int b)
	{
		int multi=a*b;
		System.out.println("multiplication:"+multi);
	}
	void div(int a,int b) {
		int div=a/b;
		System.out.println("division:"+div);
	}
	void power(int a,int b) {
		long result = 1;

		while (a!= 0) {
	      result *= b;
	      --a;
	    }

	    System.out.println("Answer = " + result);
	  }
	
	void table(int a) {
		for(int i=1; i <= 10; i++)
        {
            System.out.println(a+" * "+i+" = "+a*i);
        }
	}
	public void  acceptData(int a,int b)
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
airthmetic obj=new airthmetic();
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number");
int a=sc.nextInt();
System.out.println("Enter 2nd number");
int b=sc.nextInt();
obj.add(a,b);
obj.sub(a,b);
obj.mul(a, b);
obj.div(a, b);
obj.power(a, b);
obj.table(a);
sc.close();
	}

}
