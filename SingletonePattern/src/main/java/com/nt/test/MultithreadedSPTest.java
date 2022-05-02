package com.nt.test;

import com.nt.main.MyThread;

public class MultithreadedSPTest {
public static void main(String[] args) {
	
	MyThread mt=new MyThread();
	
	Thread th1=new Thread(mt);
	Thread th2=new Thread(mt);
	Thread th3=new Thread(mt);
	
	th1.start();
	th2.start();
	th3.start();
	
}//main
}//class
