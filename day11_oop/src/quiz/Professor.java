package quiz;

import java.util.Scanner;

public class Professor extends Person{
	
	private int proNum; // 교수 번호
	private String position; // 직급(전임, 조교수, 외래교수)
	private String proDepartment; // 담당학과
	
	public int getProNum() {
		return proNum;
	}
	public void setProNum(int proNum) {
		this.proNum = proNum;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getProDepartment() {
		return proDepartment;
	}
	public void setProDepartment(String proDepartment) {
		this.proDepartment = proDepartment;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("교수번호는? ");
		proNum = sc.nextInt();
		System.out.println("교수 직급은? (전임, 조교수, 외래교수)");
		position = sc.next();
		System.out.println("교수의 담당 학과는? ");
		proDepartment = sc.next();
		System.out.println("교수의 이름은? ");
		name = sc.next();
		System.out.println("교수의 키는? ");
		height = sc.nextInt();
		System.out.println("교수의 몸무게는? ");
		weight = sc.nextInt();
	}
	
	public void disp() {
		input();
		System.out.println("Professor [proNum=" + proNum + ", position=" + position + ", proDepartment=" + proDepartment + ", name="
				+ name + ", height=" + height + ", weight=" + weight + "]");
	}
	
	
	
	

}
