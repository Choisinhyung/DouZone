package ex04.Operator;

//최단산쉬관논삼대콤
public class MainEntry {

	public static void main(String[] args) {
		//Shift 연산자 : <<, >>, >>>
		
		//연산에 필요한 변수는 초기화를 해주는게 좋음. 이번은 예외 (result)
		int x = 8, result;
		
//		result = x << 2; //Left Shift : 원래값 * 2 ^(bit수)
		result = x >> 3; //Right Shift : 원래값 / 2 ^(bit수)
		
//		System.out.println("left shift result : " + result); //32
		System.out.println("right shift result : " + result); //1
	
	}

}
