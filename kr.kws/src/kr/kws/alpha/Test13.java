package kr.kws.alpha;

import java.util.Scanner;

public class Test13 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("계산기 : ");
		int num1 = scan.nextInt(); 
		char sign = scan.next().charAt(0);
		int num2 = scan.nextInt(); 
		float result = 0;
		
		if (sign == '+') {
			result = num1 + num2;		
		} else if (sign == '-') {
			result = num1 - num2;
		} else if (sign == '*') {
			result = num1 * num2;
		} else if (sign == '/') {
			result = (float) num1 / num2;
		}
		System.out.printf("%d %c %d = %.2f", num1, sign, num2, result);	
	}
}
//scan.next().charAt(0) : 0번째 자리의 문자형 
//수식을 입력하여 계산하기
// 계산기 // 입력형식 3 * 2
// 출력형식 3 * 2 = 6