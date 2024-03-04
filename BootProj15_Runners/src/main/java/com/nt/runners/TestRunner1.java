package com.nt.runners;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;

public class TestRunner1 implements CommandLineRunner {

	
	public TestRunner1() {
		System.out.println("TestRunner1:: 0-param consturctor");
	}
	@Override
	public void run(String... args) throws Exception {
	System.out.println("TestRunner1.run()");
	System.out.println("The args are :::"+Arrays.toString(args));

	}

}
