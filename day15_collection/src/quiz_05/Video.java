package quiz_05;

import java.util.Date;

public class Video { //model
	//
	protected String title; // 비디오 제목
	protected String category; // 장르
	protected String lend; // 대여여부 : yes, no
	protected String lendName; // 대여자(고객명)
	protected Date lendDate; // 대여일자(오늘 날짜 입력)
	
	public Video() {
		
	}

	public Video(String title, String category, String lend, String lendName, Date lendDate) {
		this.title = title;
		this.category = category;
		this.lend = lend;
		this.lendName = lendName;
		this.lendDate = lendDate;
	}
	
	public String display() {
		System.out.println("비디오 제목 : " + title);
		System.out.println("비디오 장르 : " + category);
		System.out.println("대여 여부 : " + lend);
		System.out.println("대여자명 : " + lendName);
		System.out.println("대여일자 : " + lendDate);
		String result = "대여 목록은 위와 같습니다. ";
		System.out.println();
		return result;
	}
	
}
