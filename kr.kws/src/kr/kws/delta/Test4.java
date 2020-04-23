package kr.kws.delta;
import java.util.Scanner;
import static java.lang.Math.*;
public class Test4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		double num = scan.nextDouble();
		float result = round(num / 100) * 100;
		System.out.printf("%.0f",result);
		
		
				


	}

}
