package ex04.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// 버블 정렬 : 기준이 없음, 각 데이터들이 독립상태
		// 인접한 두 요소를 비교해서 자리 바꾸기
		// flag변수를 사용할 수 있다. 
		
		int[] a = {7, 3, 5, 2, 8};
		int tmp;
		boolean flag = true;
		
		System.out.println("sort전 출력");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length - i - 1; j++) { //회전할 때마다 데이터가 빠져야 하기 때문에 -i -1
				if(a[j] > a[j + 1]) { //j가 비교대상
					tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
					
				}
			}
		}
		
		System.out.println("\nsort후 출력");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

}
