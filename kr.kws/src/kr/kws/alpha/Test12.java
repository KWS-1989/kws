package kr.kws.alpha;

import java.util.Scanner;

public class Test12 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("두 수를 입력해주세요 >> ");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		String result = " ";
		
		if (num1 > num2) {
			result = " > ";
		} else if (num1 == num2) {
			result = " = ";
		} else {
			result = " < ";
		}
		System.out.printf("%d %s %d", num1, result, num2);
	}
}
// 두 수를 입력하여 크기를 비교
// 출력형식이 a>b, a=b, a<b
