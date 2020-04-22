package kr.kws.charle;

public class Test1 {
	public static void main(String [] args) {
		int[]kor = {89, 70, 99, 80, 60};
		int[]eng = {98, 87, 75, 68, 66};
		int[]math = {100, 76, 89, 90, 80};
		String name[] = {"홍길동", "김지수", "정안나", "이지원", "지성용"};
		
		System.out.println("번호   이름   국어   영어    수학    총점      평균 ");
		System.out.println("==============================");
		
		for(int i=0; i<name.length; i++) {		//가로로 출력하는 법?아랫 줄이 필요없었다.. 밑에 중첩 for문 없이도 잘돌아감..
			for(int k=i; k<kor.length; k++) {
			}
			for(int e=i; e<eng.length; e++) {
			}
			for(int m=i; m<math.length; m++) {
			}
			System.out.printf("%d  %s  %d   %d  %d  %d  %.1f\n",
					i+1, name[i], kor[i], eng[i], math[i], (kor[i]+eng[i]+math[i]), ((float)(kor[i]+eng[i]+math[i])/3));
		}
		for(int i=0; i>3; i++) {
			kor[i]++;
			eng[i]++;
			math[i]++;
		}
		System.out.println("==============================");
		System.out.printf("       평균  : %d   %d  %d", kor[], eng[]], math[]);	// 아예 구현이 불가능한 과목 평균
// 실패 1. 처음부터 평균을 카운팅할 변수를 만들지 않았음.
// 실패 2. 불필요한 중첩 for문. 아무런 필요가 없었음.
// 실패3. 그 결과 과목 평균을 구할 프린트 문이 완성될 수 없었음.
		
	}

	}

// 성적처리, 이름 과 국어, 영어, 수학 점수를 각각 배열로 처리
// 이름은 String 배열
// ===================
//	    평균 : 각 점수별 평균 기록