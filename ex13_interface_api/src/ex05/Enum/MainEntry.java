package ex05.Enum;

public class MainEntry {
	
	// [접근지정자] enum 열거형이름 { 필요한 상수들 나열 }
	
	public enum UserStatus { //정수형 데이터를 가짐
		PENDING, // 0번
		ACTIVE,
		INACTIVE,
		DELETE ; // 4번 
	}

	public static void main(String[] args) {
		
		//1. 얘를 찍어줘~
		System.out.println(UserStatus.DELETE);
		System.out.println("----------------");
		
		
		//2. 값들을 다 출력해줘~
		for ( UserStatus status : UserStatus.values()) {
			System.out.println(status);
		}
	}

}
