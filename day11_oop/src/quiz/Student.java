package quiz;

import java.util.Scanner;

public class Student extends Person{
	
	private String department; // 학과
	private int id; // 학번
	private int grade; // 학년
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생의 학과는? ");
		department = sc.next();
		System.out.println("학생의 학번은? ");
		id = sc.nextInt();
		System.out.println("학생의 학년은? ");
		grade = sc.nextInt();
		System.out.println("학생의 이름은? ");
		name = sc.next();
		System.out.println("학생의 키는? ");
		height = sc.nextInt();
		System.out.println("학생의 몸무게는? ");
		weight = sc.nextInt();
	}
	
	public void disp() {
		input();
		System.out.println("Student [department=" + department + ", id=" + id + ", grade=" + grade + ", name=" + name + ", height="
				+ height + ", weight=" + weight + "]");
	}
	
	

}
