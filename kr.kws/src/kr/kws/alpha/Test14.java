package kr.kws.alpha;

import java.util.Scanner;

public class Test14 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요 >> ");
		int info = scan.nextInt();
		int db = scan.nextInt();
		int pg = scan.nextInt();
		String result = "";
		int avg = (info + db + pg) / 3;
		
		if (avg >= 60) {
			if (info >=40 && db >= 40 && pg >= 40) {
			result = "합격";
		} else { 
			if (info < 40) {
				result = "정보기초 점수 미달";
			} if (db < 40) {
				result = "DB 점수 미달";
			} if (pg < 40) {
				result = "프로그래밍 언어 점수 미달";
			}
			result += "로 불합격 ";
		}
			
		} else {
			result = "평균 점수 미달로 불합격";
		}
	
		System.out.printf("정보기초 : %d, DB : %d, 프로그래밍 언어 : %d 평균 점수 : %d \n%s"
				, info, db, pg, avg, result);
	}
}
		
// 3과목 (정보기초, DB, 프로그래밍 언어)의 평균이 60 이상이면 합격이다.
// 단, 한 과목이라도 40점 미만이면 불합격