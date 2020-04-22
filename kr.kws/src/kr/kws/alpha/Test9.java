package kr.kws.alpha;

import java.util.Scanner;

public class Test9 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("국어, 영어, 수학 점수를 입력하세요 >> \n");
		
		int lang = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();				
		float avg = ((float)(lang + eng + math) / 3);
		String result = "";
		
		if (avg >= 80) {			
			result = "합격";
		} else {		
			result = "불합격";
		}
			System.out.printf("국어 : %d, 영어 : %d, 수학 : %d, 평균 : %4.1f, %s",
						lang, eng, math, avg, result);
		}
}
		


//국 영 수 점수 입력하여 평균이 80이상이면 합격, 80 미만이면 불합격
// 국어 : , 영어 : ,  수학 : , 평균 : , '최종상태 '