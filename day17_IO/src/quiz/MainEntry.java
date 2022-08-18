package quiz;

import java.util.Scanner;

public class MainEntry {

		static String name;
		static String phoneNum;
		static String department;
		static String lank;
		static int pay;
		
	public static void main(String[] args) {
		
		Emp emp = new Emp();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("-------직원 관리 프로그램 -------");
			System.out.println("1. 직원 정보 입력");
			System.out.println("2. 직원 정보 삭제");
			System.out.println("3. 직원 리스트 출력");
			System.out.println("4. 직원 정보 수정");
			System.out.println("5. 종료");
			System.out.println("----------------------------");
			System.out.print("번호를 입력해주세요 >> ");
			int inNum = sc.nextInt();
			
			switch(inNum) {
			case 1 : 
				System.out.println("직원명을 입력해주세요");
				input();
				emp.EmpAdd(name, phoneNum, department, lank, pay);
				System.out.println("입력이 완료되었습니다. 초기화면으로 돌아갑니다. \n");
				break;
				
			case 2 : 
				System.out.println("\n직원 정보를 삭제합니다.");
				System.out.println("삭제를 원하는 직원의 이름을 입력하세요.");
				name= sc.next();
				emp.EmpRmv(name);
				System.out.println("삭제가 완료되었습니다. 초기화면으로 돌아갑니다. \n");
				break;
				
			case 3 : 
				System.out.println("\n모든 직원 정보를 출력하겠습니다. \n");
				emp.list();
				System.out.println("출력이 완료되었습니다. 초기화면으로 돌아갑니다. \n");
				break;
				
			case 4 : 
				System.out.println("직원 정보를 수정합니다.");
				System.out.println("수정할 직원의 이름을 입력해주세요");
				name = sc.next();
				emp.EmpRmv(name);
				System.out.println("수정할 정보를 입력하세요");
				input();
				emp.EmpCh(name, phoneNum, department, lank, pay);
				break;
				
			case 5 : 
				System.out.println("프로그램을 종료합니다. ");
				System.exit(0);
				break;
			}
			
		}
		
	}

	public static void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("직원명 >> ");
		name = sc.next();
		System.out.print("연락처 >> ");
		phoneNum = sc.next();
		System.out.print("부서 >> ");
		department = sc.next();
		System.out.print("직급 >> ");
		lank = sc.next();
		System.out.print("급여 >> ");
		pay = sc.nextInt();
		System.out.println();
		
	}
}
