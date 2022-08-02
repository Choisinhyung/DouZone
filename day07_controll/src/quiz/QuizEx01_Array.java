package quiz;

public class QuizEx01_Array {

	public static void main(String[] args) {
		//문제1) int[] arr = {1, 7, 3, 7, 99, 7, 8, 55, 7, 90, 7};
		//      위의 배열에서 7의 갯수가 몇 개인지 찾아보시오.
		
		int[] arr = {1, 7, 3, 7, 99, 7, 8, 55, 7, 90, 7};
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 7) {
				count++;
			}
		}
		System.out.println(count);
	}

}
