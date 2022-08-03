package ex04.sort;

public class SelectionSort {

	public static void main(String[] args) {
		// 선택 정렬 : 기준이 있음 / 항상 배열의 첫 번째 값을 기준으로 가장 작은 값이 맨 앞에 들어가면 
		// 기준에서 제외되고 그 다음 값을 기준으로 변경한다.  ⇒ 반복
		// 데이터 수만큼 계속 비교
		
		int[] a = {7, 3, 5, 2, 8};
		int tmp;
		
		System.out.println("sort전 출력");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		
		for(int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				if(a[i] > a[j]) { // 부등호 방향으로 오름차순, 내림차순
					//교환
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				} //if end
			} //j end
		} //i end
		
		System.out.println("\nsort후 출력");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

}
