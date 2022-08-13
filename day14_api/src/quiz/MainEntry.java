package quiz;

public class MainEntry {

	public static void main(String[] args) {
		
		String str = "abcDEFGHeijwEIMPYmnqr";
		
		String result = "";
		String a = str.toUpperCase();
		String b = str.toLowerCase();
		System.out.println(a);
		System.out.println(b);
		System.out.println(a + "  " + b);
		
		for(int i = 0; i < str.length(); i++) {
			// 단어의 길이만큼 반복
			char ch = str.charAt(i); 
			
			if(ch >= 'A' && ch <= 'Z') {
				result += String.valueOf(ch).toLowerCase();
			} else if (ch >= 'a' && ch <= 'z') {
				result += String.valueOf(ch).toUpperCase();
			} else {
				result += ch;
			}
		}	
		System.out.println(result);

	}

}
