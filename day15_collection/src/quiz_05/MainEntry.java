package quiz_05;

import java.util.Date;
import java.util.Scanner;

public class MainEntry {
	
	static String title;
	static String category; // 장르
	static String lend; // 대여여부 : yes, no
	static String lendName; // 대여자(고객명)
	static Date lendDate; // 대여일자(오늘 날짜)

	public static void main(String[] args) {
		VideoInfo vf = new VideoInfo();
		Date now = new Date();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n\n*-*-*-*-* 메뉴 *-*-*-*-*");
			System.out.println("1. 대여 정보 입력");
			System.out.println("2. 대여 정보 삭제");
			System.out.println("3. 대여 정보 수정");
			System.out.println("4. 대여 리스트 보기");
			System.out.println("5. 종료");
			System.out.println("----------------------");
			System.out.print(" 번호를 입력해주세요 >> ");
			int inNum = sc.nextInt();
			
			switch (inNum) {
			case 1 :
				System.out.println("비디오 제목을 입력해주세요.");
				input();
				vf.VideoInfoAdd(title, category, lend, lendName, now);
				System.out.println("입력이 완료되었습니다. ");
				break;
				
			case 2 : 
				System.out.println("대여 정보를 삭제합니다.");
				System.out.println("삭제를 원하는 정보의 제목을 입력하세요.");
				title = sc.next();
				vf.VideoInfoRmv(title);
				System.out.println("삭제가 완료되었습니다.");
				break;
				
			case 3 : 
				System.out.println("대여 정보를 수정합니다.");
//				vf.display();
				System.out.println("수정할 정보의 제목을 입력해주세요");
				title = sc.next();
				vf.VideoInfoRmv(title);
				System.out.println("수정할 정보를 입력하세요");
				input();
				vf.VideoInfoCh(title, category, lend, lendName, now);
				break;
			
			case 4 : 
				System.out.println("모든 대여 정보를 출력하겠습니다. ");
				vf.list();
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
		Date now = new Date();
//		Video v = new Video(title, category, lend, lendName, lendDate);
		
		System.out.print("비디오 제목 >> ");
		title = sc.next();
		System.out.print("비디오 장르 >> ");
		category = sc.next();
		System.out.print("대여 여부(Y / N) >> ");
		lend = sc.next();
		System.out.print("대여자명 >> ");
		lendName = sc.next();
		System.out.print("대여날짜는 자동으로 추가됩니다. ");
		lendDate = now;
		
	}

}
