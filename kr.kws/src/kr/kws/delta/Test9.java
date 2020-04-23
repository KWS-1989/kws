package kr.kws.delta;

import java.util.StringTokenizer;
import java.util.Arrays;

public class Test9 {

	public static void main(String[] args) {
		
		String ireum = "홍길동,김지수,정안나,하희라,한민수,장길순,응봉순,박철원,원종근,이미나,한지원,지성용";
		String arr[] = new String[12];
		int seat[] = new int[12];
		int temp;
		
		System.out.println("\t\t                                       ");
		System.out.println("\t\t*************   좌석 배치표      *************");
		System.out.println("\t\t                                       ");
		System.out.println("==============================================================================");
		System.out.println("\t\t 1열\t\t 2열\t\t 3열\t\t 4열                                ");
		System.out.println("==============================================================================");
		
		
		StringTokenizer st = new StringTokenizer(ireum, ",");		// ,을 기준으로 이름을 구분해서 arr에 저장함
		for(int i=0; i<12; i++) {
			arr[i] = st.nextToken();
		}
		
		for(int i=0; i<12; i++) {									// 12가지의 자리 배정 수를 seat에 저장함
			do {
				temp = (int)(Math.random() * 12);
			} while(seat[temp] != 0); 
				seat[temp] = i;
		}
		
		for(int i=0; i<12; i++) {
			System.out.printf("%02d번 : %s\t",i+1, arr[seat[i]]);		// %02d번 : 번호수에 0을 2자릿수까지 표현
			if((i+1)%4==0) {
				System.out.println();
			}
		}
		System.out.println("==============================================================================");

	}
}						

		//		while(st.hasMoreTokens()) {		st.nextToken())						// 토큰이 남아있을 떄 까지 반복
		// 1. 난수로 랜덤하게 좌석이 배치되어야하고
		// 2. 번호와 사람 이름은 그 배열에 그 사람이 있다는 걸 보여주는 것이기에 동일해야함
		// 3. ,를 기준으로 스트링 안의 문자열을 쪼개고 배열에 삽입
