package ex01.array;

public class ForeachTest {

	public static void main(String[] args) {
		
		int sum = 0, num;
		for ( num = 1; ; num++ ) { //무한루프
			sum += num;
			if(sum >= 100) break;
		}
		
		System.out.println(sum);
		System.out.println(num);
		
		for(num = 1; num <= 100; num++) {
			if(num % 3 != 0) { //3의 배수가 아니면 continue
				continue;
				
			}
			System.out.println(num);
		}
		
		
		int[] score = {78, 70, 88, 99, 58};
		int hap = 0;
		for(int item : score) {
			hap += item;
		}
		System.out.println("점수합계 : " + hap);
	}

}
