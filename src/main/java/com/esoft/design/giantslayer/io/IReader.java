package com.esoft.design.giantslayer.io;

import java.io.IOException;

public interface IReader {

	public void configure() throws IOException;
	
	public int read() throws IOException,InterruptedException;
	
	public void enqueueTo() throws InterruptedException;
	
	public void print();
}
