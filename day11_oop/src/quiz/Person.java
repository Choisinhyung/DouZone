package quiz;

import java.util.Scanner;

public class Person {
	protected String name; // 이름
	protected int height; // 키
	protected int weight; // 몸무게
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

}
