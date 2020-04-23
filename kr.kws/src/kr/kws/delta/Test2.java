package kr.kws.delta;

public class Test2 {

	public static void main(String[] args) {
		String hello = "Hello.java";
		int index = hello.indexOf(".");
		
		String ans1 = hello.substring(0, index);
		String ans2 = hello.substring(index+1);
		
		System.out.printf("%s의 확장자를 제외한 이름은  %s\n%s의 확장자는 %s", hello, ans1, hello, ans2);
	}
}

		
