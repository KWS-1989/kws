package kr.kws.delta;

public class Test {
	public static void main(String [] args) {
		String subject = "자바 프로그래밍";
		String ssn = "880815-1234567";
		char charValue = subject.charAt(3);		//해당 스트링의 몇번째 자리 단어 캐치
		
		int index = subject.indexOf("자바");		//단어 시작되는 부분의 자릿수 캐치
		
		int length = subject.length();			//문자열의 길이 캐치
		
		String newStr = subject.replace("자바", "JAVA");	// 왼쪽의 단어를 오른쪽으로 바꿔버림
		
		String firstNum = ssn.substring(0, 6);	// 시작 자리수 ~ 끝 자리수 -1까지의 문자열 추출
		
		String secondNum = ssn.substring(7);	// 시작만 입력하면 주어진 수에서부터 끝 문자열까지 전부 추출
		
		System.out.printf("%c %d %d %s %s %s \n", charValue, index, length, newStr, firstNum, secondNum);
		 
		String choice = ssn.substring(7, 8); 
		if (choice.equals("1")) {
			System.out.println("남자");
			if (choice.equals("2")) {
				System.out.println("여자");
			}
		}
	}
}
	
				



