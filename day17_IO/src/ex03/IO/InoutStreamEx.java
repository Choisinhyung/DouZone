package ex03.IO;

public class InoutStreamEx {

	public static void main(String[] args) {
		System.out.println("input = ");
		
		try {
			int su;
			
			while((su = System.in.read()) != -1) { // 더 이상 읽어올 데이터가 없다면(-1)
				
				if(su == 10 || su == 13 || su == 32) continue;
				if(su == 113 || su == 81) break; // 'q' || 'Q'
				
				char ch = (char)su;
				System.out.println(ch);
			}
		} catch (Exception e) {
			
		}

	}

}
