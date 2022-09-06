package homework;

import java.util.regex.Matcher;

public class Pattern {
	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("^[0-9]*$");
		String str = "04234234";

		Matcher matcher = pattern.matcher(str);
		System.out.println(matcher.find());
	}

	private Matcher matcher(String str) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Pattern compile(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private static boolean matches(String pattern, String str) {
		// TODO Auto-generated method stub
		return false;
	}
}
