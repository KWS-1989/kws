package kr.kws.alpha;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("두 수를 입력하세요.\n");
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	
	int max = (num1 > num2) ? num1 : num2;
	int min = (num1 < num2) ? num1 : num2;
	
	System.out.printf("큰 수는 %d 작은 수는 %d 입니다.", max, min);
	}
}
//두 수를 입력하여 큰 수와 작은 수를 출력하는 프로그램 (삼항연산자)
// 두수를 입력하세요 >> 30 90
// 큰 수는 90 작은 수는 30입니다. if 아님

//조건문  ? 참 : 거짓
