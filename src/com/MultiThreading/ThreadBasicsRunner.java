package com.MultiThreading;

//extend Thread
		//implements runnable

		class Task1 extends Thread {
			@Override
			public void run() {
				System.out.print("\nTask1 Started ");

				for (int i = 101; i <= 199; i++) {
					System.out.print(i + " ");
				}
				
				System.out.print("\nTask1 done");
			}
		}
		
		class Task2 implements Runnable{

			@Override
			public void run() {
				System.out.print("\nTask2 Started ");

				for (int i = 201; i <= 299; i++) {
					System.out.print(i + " ");
				}
				
				System.out.print("\nTask2 done");

				
			}
			
		}


public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {
		
				//Task1 - 101 to 199
				System.out.print("\nTask1 kicked off");
				Task1 task1 = new Task1();
				task1.setPriority(1);
				task1.start();

				// Task2
				System.out.print("\nTask2 kicked off");
				Task2 task2 = new Task2();
				Thread task2Thread = new Thread(task2);
				task2Thread.setPriority(1);
				task2Thread.start();
				
				task1.join();
				task2Thread.join();

				System.out.print("\nTask3 kicked off");
				//Task3
				for (int i = 301; i <= 399; i++) 
					System.out.print(i + " ");
				
				
				System.out.print("\nTask3 done");

				System.out.print("\nmain done");

	}

}






