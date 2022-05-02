package com.nt.test;

import com.nt.main.Printer;

public class SingtonePatternTest {
public static void main(String[] args) {
	//object creation 
	//Printer name = new Printer();
	Printer p1=Printer.getInstance();
	Printer p2=Printer.getInstance();
	System.out.println(p1.hashCode()+"  "+p2.hashCode());      //it gives hashcode
	System.out.println(p1==p2);
	}//main
}//class
