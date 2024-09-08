package codingtest.week01;

public class Ex0113 {
	public static void main(String[] args) {
		String str = "Good Morning";
		
		System.out.println("CharAt: " + str.charAt(7));
		System.out.println("StartsWith:" + str.startsWith("good"));
		System.out.println("endsWith:" + str.endsWith("ng"));
		System.out.println("equals:" + str.equals("Good morning"));
		System.out.println("indexOf:" + str.indexOf("M"));
		System.out.println("lastIndexOf" + str.lastIndexOf("n"));
		System.out.println("length:" + str.length());
		
		System.out.println("replace:" + str.replace("Good", "a"));
		System.out.println("replace:" + str.replace("o", "a"));
		System.out.println("replace:" + str.replace("[Good]", "a"));

		System.out.println("replaceAll:" + str.replaceAll("Good", "a"));
		System.out.println("replaceAll:" + str.replaceAll("o", "a"));
		System.out.println("replaceAll:" + str.replaceAll("[^G]", "a"));//^은 not을 의미한다.
		System.out.println("replaceAll:" + str.replaceAll("^[G]", "a"));//시작
		System.out.println("replaceAll:" + str.replaceAll("[g]$", "a"));//끝

	}
}
