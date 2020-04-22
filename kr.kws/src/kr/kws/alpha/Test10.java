package kr.kws.alpha;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도를 입력하여 주세요 >>");
		
		int year = scan.nextInt();
		
		String result = "";
		
		if ((year%4==0 && year%100!=0) || (year%400==0)) {
			result = "윤년";
		} else {
			result = "평년";
		}		
		System.out.printf("%d년은 %s 입니다", year, result);
		}
}
		
//년도를 입력하여 윤년 또는 평년 출력하기
// 윤년 : 4의 배수 , 그중 100의 배수 평년, 하지만 400의 배수는 윤년
