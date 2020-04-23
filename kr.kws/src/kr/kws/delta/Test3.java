package kr.kws.delta;

import static java.lang.Math.*;
import static java.lang.System.*;

public class Test3 {
	public static void main(String[] args) {
		double val = 90.7552;
		float result = round(val * 100) / (float) 100;	// 9075.52으로 만들어 9076으로 반올림 한 후 100을 나눠 90.76
		out.println("round(90.7552,2) = " + result);
		
		double r = rint(-1.5);				// 린트는 라운드와 달리 음수에서 사용할 경우 오류가 발생할 수 있다.
		long i = round(-1.5);
		out.println("rint(-1.5) = " + r + ", round(-1.5) = " + i);
	}
}


