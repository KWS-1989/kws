package kr.kws.alpha;

import java.util.Scanner;

public class Test4 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 >> \n");
		int num = scan.nextInt();
		
		System.out.printf("%d는 %s 입니다", num, num%2==0 ? "짝수" : "홀수");
	}
	
}


//삼항연산자 이용
// 숫자를 입력하세요 >>
// 짝스 홀수 출력