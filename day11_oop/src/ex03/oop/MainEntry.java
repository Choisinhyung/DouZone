package ex03.oop;

public class MainEntry {

	public static void main(String[] args) {
		Sawon s = new Sawon();
		
		s.setId(1);
		s.setName("최신형");
		s.setPosition("사원");
		s.setDepartment("개발");
		s.setPay(5000000);
		s.setPhoneNumber("010-2266-3644");
		s.display();

	}

}
