package com.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		// ExecutorService executorService = Executors.newFixedThreadPool(2);
		
		
		executorService.execute(new Task1());
		executorService.execute(new Thread(new Task2()));

		System.out.println("\n Task3 Kicked off");

		// Task3
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask3 done");

		System.out.print("\nmain done");

		executorService.shutdown();

	}

}
