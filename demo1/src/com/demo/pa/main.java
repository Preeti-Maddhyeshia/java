package com.demo.pa;

import java.util.ArrayList;
import java.util.LinkedList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList l=new LinkedList();
l.add(10);
l.add("a");
l.add("a");
l.add(null);
l.set(0, "preeti");
l.add(0, "amit");
l.removeLast();
l.removeFirst();
System.out.println(l);
l.remove(2);
System.out.println(l);
l.add(2, "m");
l.add("n");
System.out.println(l);
	}

}
