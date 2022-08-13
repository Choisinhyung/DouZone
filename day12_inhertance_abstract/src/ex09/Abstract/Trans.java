package ex09.Abstract;

import java.util.Scanner;

public abstract class Trans {
	
	String name;
	
	public abstract void start(String name);
	public abstract void stop(String name);
	
	public String _name(String name) {
		return name;
	}

}
