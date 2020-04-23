package kr.kws.delta;

import java.util.StringTokenizer;

public class Test8 {

	public static void main(String[] args) {
		String source = "100,200,300,400,500,600";
		StringTokenizer st = new StringTokenizer(source, ",");	// 소스에 적힌 문자열을 ,를 기준으로 쪼갠다	
		
		while(st.hasMoreTokens()) {								// 토큰이 남아있을 떄 까지 반복
			System.out.println(st.nextToken());
		}														// 그 밖에 nextToken() = 토큰을 하나씩 꺼내옴
	}
}
