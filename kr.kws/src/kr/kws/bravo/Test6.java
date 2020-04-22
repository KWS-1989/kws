package kr.kws.bravo;

public class Test6 {

	public static void main(String[] args) {
		int num = 1;
		
		for(int i=1; i<=10; i++) {
			for(int z=1; z<=10; z++) {
				
				System.out.printf("%d\t",num++);
			}
			System.out.println();
		}

	}

}

//1부터 100까지의 수를 한줄에 10개씩 출력하기
//1 2 3 4 5 6 7 8 9 10
//11 12 13 14 이런식