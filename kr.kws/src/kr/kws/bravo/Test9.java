package kr.kws.bravo;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cnt = 0;
		int korSum = 0;
		int engSum = 0;
		int mathSum = 0;			
		/* int cnt, korSum, engSum, mathSum;
		 * korSum=engSum=mathSum=count=0; 이런식으로 도 사용 가능
		 */
		
		while(true) {
			System.out.print("번호를 입력하세요 (종료 : 0) : ");
			int num = scan.nextInt();
			if (num == 0) {				// 0을 입력 받으면 브레이크가 걸려 반복 문이 종료
			break;
			}
			
			System.out.printf("%d번의 국어, 영어, 수학 점수를 입력하세요 >> ", num);
			int kor = scan.nextInt();
			int eng = scan.nextInt();
			int math = scan.nextInt();
			cnt ++;						// 반복문에서 평균을 구하기 위한 카운트
			korSum += kor;				// 입력되는 각 해당되는 점수들의 값을 해당 변수에 계속 더해주는 것
			engSum += eng;
			mathSum += math;
		}		
		
		int korAvg = korSum / cnt;	// 반복문이 끝난 후 반복된 만큼 더해진 sum에 반복된 만큼 증가한 카운트를 나누면 평균
		int engAvg = engSum / cnt;
		int mathAvg = mathSum / cnt;
		System.out.printf("국어 평균 : %d점, 영어 평균 : %d점, 수학 평균 : %d점\n", korAvg, engAvg, mathAvg);
	}
}

// 번호 입력 -> %d번의 국어, 영어, 수학 점수를 입력 -> 
// 번호와 국어, 영어, 수학 점수가 입력되며, 번호가 0이면 끝
