package ex02.randomMethod;

public class MainEntry {

	public static void main(String[] args) {
		// 난수 구하기
		// 리턴 타입은 항상 실수
		
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println();
		
		//random() : 난수발생 0.0 ~ 1.0
		System.out.println(Math.random());
		// 1 ~ 5까지 출력
		System.out.println((int)(Math.random() * 5 + 1));
		
		int[] arr = new int[45];
		for(int i = 0; i < arr.length; i++) {
			arr[i] += (int)(Math.random() * 45 + 1);
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
