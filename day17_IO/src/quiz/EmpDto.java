package quiz;

public class EmpDto {
		
		protected String name;
		protected String phoneNum;
		protected String department;
		protected String lank;
		protected int pay;
		
		public EmpDto() {
			
		}
		
		public EmpDto(String name, String phoneNum, String department, String lank, int pay) {
			this.name = name;
			this.phoneNum = phoneNum;
			this.department = department;
			this.lank = lank;
			this.pay = pay;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getPhoneNum() {
			return phoneNum;
		}
		
		public void setPhoneNum(String phoneNum) {
			this.phoneNum = phoneNum;
		}
		
		public String getDepartment() {
			return department;
		}
		
		public void setDepartment(String department) {
			this.department = department;
		}
		
		public String getLank() {
			return lank;
		}
		
		public void setLank(String lank) {
			this.lank = lank;
		}
		
		public int getPay() {
			return pay;
		}
		
		public void setPay(int pay) {
			this.pay = pay;
		}
		
		public String display() {
			System.out.println("직원명 : ");
			System.out.println("연락처 : ");
			System.out.println("부서 : ");
			System.out.println("직급 : ");
			System.out.println("급여 : ");
			String result = "목록 조회를 완료하였습니다.";
			return result;
		}

		@Override
		public String toString() {
			return "직원명 : " + name + "\n연락처 : " + phoneNum + "\n부서 : " + department + "\n직급 : " + lank
					+ "\n급여 : " + pay;
		}
		
		
		
		

}
