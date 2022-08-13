package ex02.stringBuffer;

public class StringBufferEx02 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("This");
		
		System.out.println(sb);
		
		sb.append(" is pencil"); // 문자열 추가
		System.out.println(sb);
		
		sb.insert(7, " my"); // 문자열 삽입
		System.out.println(sb);
		
		sb.replace(8, 10, "your"); // 문자열 변경
		System.out.println(sb);
		
		sb.setLength(5); // 문자열 길이 자르기 : 나머지 데이터는 안보임

	}

}
