package ex03.oop;

public class Sawon {
	
	private int id; //사번
	private String name; //이름
	private String position; //직급
	private String department; //부서
	private int pay; //급여
	private String phoneNumber; //연락처
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public int getPay() {
		return pay;
	}
	
	public void setPay(int pay) {
		this.pay = pay;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void display() {
		System.out.println("사번 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("직급 : " + position);
		System.out.println("부서 : " + department);
		System.out.println("급여 : " + pay);
		System.out.println("연락처 : " + phoneNumber);
		
	}

}
