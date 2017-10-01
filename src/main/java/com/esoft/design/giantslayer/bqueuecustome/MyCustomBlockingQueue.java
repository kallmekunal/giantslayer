package com.esoft.design.giantslayer.bqueuecustome;

import java.util.LinkedList;
import java.util.List;

public class MyCustomBlockingQueue<E> {
	List <E> list;
	int size;

	public MyCustomBlockingQueue(int maxSize) {
		this.size = maxSize;
		list = new LinkedList<E>();
	}

	public synchronized void put(E item) throws InterruptedException {
		if(list.size() == size)
		{
			wait();
		}
		
		if(list.size() == 0) {
			notifyAll();
		}
		
		list.add(item);
	}
	
	
	public synchronized E get() throws InterruptedException {
		if(list.size() == 0) {
			wait();
		}
		
		if(list.size() == size) {
			notifyAll();
		}
		
		return list.remove(0);
	}
}
