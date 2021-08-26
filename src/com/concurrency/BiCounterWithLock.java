package com.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
	private int i = 0;
	private int j = 0;

	Lock lockForI = new ReentrantLock();
	Lock lockForJ = new ReentrantLock();

	public void incrementI() {
		lockForI.lock();// get lock forI
		i++;
		lockForI.unlock();// Released lock forI

	}

	public int getI() {
		return i;
	}

	public void incrementJ() {
		lockForJ.lock();// get lock forJ
		j++;
		lockForJ.unlock();// Released lock forJ
	}

	public int getJ() {
		return j;
	}
}

