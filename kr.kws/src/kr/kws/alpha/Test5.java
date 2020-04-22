package kr.kws.alpha;

import java.util.Scanner;

public class Test5 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("금액을 입력하세요 >> ");
		int money = scan.nextInt();
		
		int oman, man, ocen, cen, etc;
		oman = money / 50000;
		// money %= 50000; 로 대체 가능
		man = (money % 50000) / 10000;	// 오만원 나누고 남은 값 나누기 만원
		ocen = (money % 10000) / 5000;
		cen = (money % 5000) / 1000;
		etc = money % 1000;
		
		System.out.printf("오만원권 : %d장, 만원권 : %d장, 오천원권 : %d장, 천원권 : %d장, 잔돈 : %d원",
				oman, man, ocen, cen, etc);
	}
}

//int money / 50000
//금액을 입력하세요 >>
// 5만원권 1장, 1만원권, 5천원권, 천원권 나열되게 계산
// 최소한의 개수가 되게 나누기