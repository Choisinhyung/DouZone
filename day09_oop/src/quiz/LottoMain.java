package quiz;

import java.util.Arrays;
import java.util.Random;

public class LottoMain {

	public static void main(String[] args) {
		
		Random rand = new Random();
		
		System.out.println("로또 숫자 생성을 시작하겠습니다. ");
		
		int[] arr = new int[6]; // 랜덤 숫자 저장 할 배열 생성
		
		for(int i = 0; i < 6; i++) {
			arr[i] = rand.nextInt(45)+ 1; // 배열에 랜덤숫자 저장

			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--; //같으면 i를 한번 더 돌려라
					break;
				}
			}
		}
		System.out.print(Arrays.toString(arr));
		
	}
}
