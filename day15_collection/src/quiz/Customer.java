package quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
		// 어레이리스트 사용해서
		// 고객추가 삭제 고객리스트 출력 수정 프로그램 종료 출력하는 프로그램 작성하기
		Scanner sc = new Scanner(System.in);
		ArrayList<String> a = new ArrayList();
		
		String name, address, num;
		
		public Customer() {
			
		}

		public Customer(String name, String address, String num) {
			this.name = name;
			this.address = address;
			this.num = num;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getNum() {
			return num;
		}

		public void setNum(String num) {
			this.num = num;
		}
		
		public void input() {
		   	  System.out.print("추가할 고객명을 입력해주세요. ");
		      name = sc.next();
		      setName(name);
		      a.add(getName());
		      System.out.print("추가할 고객의 주소를 입력해주세요. ");
		      address = sc.next();
		      setAddress(address);
		      a.add(getAddress());
		      System.out.print("추가할 고객의 연락처를 입력해주세요. ");
		      num = sc.next();
		      setNum(num);
		      a.add(getNum());
		          
		      System.out.println("성공적으로 추가되었습니다. 리스트 확인을 원하시면 초기화면에서 3번을 입력해주세요.");
		}
		
		public void delete() {
			  System.out.print("삭제할 고객명을 입력해주세요. ");
	          name = sc.next();
	          setName(name);
	          a.remove(getName());
	          System.out.print("삭제할 고객의 주소를 입력해주세요. ");
	          address = sc.next();
	          setAddress(address);
	          a.remove(getAddress());
	          System.out.print("삭제할 고객의 전화번호를 입력해주세요. ");
	          num = sc.next();
	          setNum(num);
	          a.remove(getNum());
	          
	          System.out.println("고객 정보가 성공적으로 삭제되었습니다.");
		      System.out.println("삭제된 후 고객리스트는 아래와 같습니다. ");
		      
		   	  for(int i = 0; i < a.size(); i++) {
				System.out.println("[" + a.get(i) + "]");
		   	  }
		}
		
		public void disp() {
	    	  System.out.println("현재 고객리스트는 아래와 같습니다. ");
		   	  for(int i = 0; i < a.size(); i++) {
				System.out.println("[" + a.get(i) + "]");
		   	  }
		}
		
		public void update() {
	    	  System.out.print("수정할 고객의 이름을 입력해주세요: ");
	    	  name = sc.next();
	    	  System.out.print("수정할 이름을 입력해주세요: ");
	    	  String name1 = sc.next();
	    	  System.out.print("수정할 고객의 주소를 입력해주세요: ");
	    	  address = sc.next();
	    	  System.out.print("수정할 주소를 입력해주세요: ");
	    	  String address1 = sc.next();
	    	  System.out.print("수정할 고객의 전화번호를 입력해주세요: ");
	    	  num = sc.next();
	    	  System.out.print("수정할 전화번호를 입력해주세요: ");
	    	  String num1 = sc.next();
	    	  
	    	  if(a.contains(name)) {
	    		  System.out.println();
	    		  a.set(a.indexOf(name), name1);
	    	  }
	    	  if(a.contains(address)) {
	    		  a.set(a.indexOf(address), address1);
	    	  }
	    	  if(a.contains(num)) {
	    		  a.set(a.indexOf(num), num1);
	    	  }
		      System.out.println("성공적으로 수정되었습니다. ");
		}
		
		
}
