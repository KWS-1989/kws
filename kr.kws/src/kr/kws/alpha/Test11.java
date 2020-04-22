package kr.kws.alpha;

import java.util.Scanner;

public class Test11 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("수를 입력해 주세요 >> ");
		
		int num = scan.nextInt();
		String result = " ";
		
		if (num%6==0) {
			result = "6의 배수";		//6의 배수를 먼저 찾으면 아랫 배수들의 중복 문제를 해결할 수 있다.
		} else if (num%2==0) {
			result = "2의 배수";
		} else if (num%3==0) {
			result = "3의 배수";
		} else {
		result = "아무 것도 아닌 수";
		}
		System.out.printf("%d는 %s이다.\n", num, result);
		}
}
//1. 6의 배수
//2~3. 2나 3의 배수 * 순서 상관없는 것은 2*3의 겹치는 배수가 6의 배수니까
//4. 아무것도 아닌 것 == else
// 입력받은 수가 2의 배수, 3의배수, 6의배수인지, 아니면 2,3,6, 모두의 배수가 아닌지 출력하기
// 모두 아니면 아무것도 아니다.