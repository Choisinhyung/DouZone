package ex03.utilPackage;

import java.util.Calendar;
import java.util.Date;

public class MainEntry {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // System이 갖고 있는 날짜 얻어옴
		
		System.out.print(c.get(Calendar.YEAR) + "년 ");
		System.out.print((c.get(Calendar.MONTH) + 1) + "월 "); // 월은 0부터 시작함
		System.out.println(c.get(Calendar.DATE) + "일");
		
		Date date = new Date();
		int h = date.getHours(); // 듀플리케이트 되었지만 사용 가능하다. 
		int m = date.getMinutes();
		int s = date.getSeconds();
		System.out.println("현재 시간은 " + h + " : " + m + " : " + s);
		
		Calendar c1 = Calendar.getInstance();
		Calendar c2 = Calendar.getInstance();
		
		c2.set(2021, 8, 12, 0, 0);
		
		//c1을 기준으로 c2와 비교
		if(c1.after(c2)) {
			System.out.println("현재 시간은 2021년 1월 1일 이전 입니다.");
		} else if(c1.before(c2)) {
			System.out.println("현재 시간은 2021년 1월 1일 이후 입니다.");
		} else if(c1.equals(c2)) {
			System.out.println("현재 시간은 2021년 1월 1일 입니다.");
		}
		
		

	}

}
