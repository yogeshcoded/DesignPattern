package com.nt.main;

public class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Ticket booking app");
		Printer t1=Printer.getInstance();
		System.out.println(t1.hashCode());
		

	}

}
