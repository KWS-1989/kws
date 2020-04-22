package kr.kws.alpha;

import java.util.Scanner;

public class Test6 {
	public static void main(String [] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("두 수를 입력하세요 >> ");
	int num = scan.nextInt();
	int num2 = scan.nextInt();
	int result = num2;	// 초기화
	
	if (num > num2) {
		result = num;	// 첫번째 값이 클 경우에만 결과값에 첫번째 값을 저장한다.
	}
		System.out.printf("%d와 %d 중 큰 수 : %d\n", num, num2, result);
	}
}

