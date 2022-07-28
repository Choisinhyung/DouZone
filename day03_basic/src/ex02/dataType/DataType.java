package ex02.dataType;

public class DataType {

	public static void main(String[] args) {
		
		short sh = -32768; // -32768 ~ 32767
		int su = 32770;
		
		su = sh; // 묵시적(자동) 형변환
		sh = (short)su; // 명시적 형변환 / 큰자료형을 작은자료형에 담으면 데이터 손실이 발생한다.
		
		System.out.println(sh +", " + su);
		
		
		boolean flag = true;
		System.out.println(flag);
		System.out.println(!flag);
		
		

	}

}
