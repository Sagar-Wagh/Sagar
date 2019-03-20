package com.TechM.stream;

import java.io.IOException;

public class MyAutoCloseable implements AutoCloseable {
	public void saySomething() throws IOException
	{
		System.out.println("something");
	}
	
public void close() throws IOException
{
	throw new IOException("Exception from close");
	//System.out.println("close");
}
}
