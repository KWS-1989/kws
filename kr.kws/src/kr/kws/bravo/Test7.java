package kr.kws.bravo;

public class Test7 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int g3=1; g3<=10; g3++) {				//3g 추 10개
			for(int g5=1; g5<=10; g5++) {			//5g 추 10개
				for(int g7=1; g7<=10; g7++) {		//7g 추 10개
					sum = g3*3 + g5*5 + g7*7;		//각 추의 수만 정해주고 무게를 정해주지 않았으니 각 추의 무게를 매긴 것
					if(sum == 78)					//위 추의 합이 78이 오면 출력한다
					System.out.printf("3g의 추 : %d개, 5g의 추 : %d개, 7g의 추 : %d개 \n", g3, g5, g7);
				}
			}
		}
	}
}
// 3g, 5g, 7g = 78g
// 각 무게추의 수는 10개씩
