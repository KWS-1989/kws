package kr.kws.alpha;

import java.util.Scanner;

public class Test15 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("월을 입력해 주세요 >> ");
		
		int month = scan.nextInt();
		
		switch(month) {
		case 12: case 1: case 2:
			System.out.printf("%d월은 겨울입니다.", month);
			break;
		case 3:	case 4:	case 5:
			System.out.printf("%d월은 봄입니다.", month);
			break;
		case 6:	case 7:	case 8:
			System.out.printf("%d월은 여름입니다.", month);
			break;
		case 9:	case 10: case 11:
			System.out.printf("%d월은 가을입니다.", month);
			break;
		}
	}
}
		

