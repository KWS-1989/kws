package kr.kws.charle;

public class Test1ans {
	public static void main(String [] args) {
	int[]kor = {89, 70, 99, 80, 60};
	int[]eng = {98, 87, 75, 68, 66};
	int[]math = {100, 76, 89, 90, 80};
	String name[] = {"홍길동", "김지수", "정안나", "이지원", "지성용"};
	
	int ave[] = new int[3];	// 과목 총점을 집계할 배열
	System.out.println("번호          이름       국어            영어         수학          총점       평균 ");
	System.out.println("============================================");
	
	for(int i=0; i<name.length; i++) {
		int sum = 0;		// 개인 총점
		float avg = 0.0f;	// 개인 평균
		
		ave[0] += kor[i];	// 과목 총점을 배열에 저장
		ave[1] += eng[i];
		ave[2] += math[i];
		
		sum = kor[i]+eng[i]+math[i];	//개인 총점
		avg = sum/3f;		// 개인 평균
		System.out.printf("%3d  %5s  %5d   %5d  %5d  %5d  %5.1f\n",
				i+1, name[i], kor[i], eng[i], math[i], sum, avg);
	}
	System.out.println("=============================================");
	System.out.print("             평균 :  ");
	for(int i=0; i<ave.length; i++) {
		System.out.printf("%5d", ave[i]/name.length); // 과목 총점에 네임 수를 나눈 만큼의 평균을 반복문으로 3개 추가
	}
	}
	
}

