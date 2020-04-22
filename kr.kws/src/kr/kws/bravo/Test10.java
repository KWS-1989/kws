package kr.kws.bravo;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int in, out, money, exit;
		in=out=money=exit=0;
		
		while(true) {
			System.out.println("============================");
			System.out.println("1.예금  | 2.출금  | 3.잔고  | 4.종료 ");
			System.out.println("============================");
			System.out.print("선택>> ");
			int choice = scan.nextInt();	// 다음엔 스위치문으로 하는게 더 보기좋고 깔끔함
			if (choice == 4) {
			System.out.print("종료합니다.");
			break;
			}
			
			if (choice == 1) {
				System.out.print("예금액>> ");
				in = scan.nextInt();
				money += in;
			}
			
			if (choice == 2) {
				System.out.print("출금액>> ");
				out = scan.nextInt();
				money -= out;
			}
			
			if (choice == 3) {
				System.out.printf("잔고>> %d\n", money);
			}
		}
	}
}

// 은행 거래 프로그램
// 예금, 출금, 잔고, 종료