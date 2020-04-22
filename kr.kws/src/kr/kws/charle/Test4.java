package kr.kws.charle;

public class Test4 {
	public static void main(String[] args) {
		int[][] score = {{89, 98, 100},
						 {70, 87, 76},
						 {99, 75, 89},
						 {80, 68, 90},
						 {60, 66, 80}};
		String name[] = {"홍길동", "김지수", "정안나", "이지원", "지성용"};
		int total[] = new int[3];
		
		System.out.println("번호\t 이름\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println("====================================================");
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			float avg;
			
			System.out.printf("%3d\t %3s",  i+1, name[i]);
			
			for(int z=0; z<score[i].length; z++) {
				sum += score[i][z];
				total[z] += score[i][z];
				System.out.printf("%5d", score[i][z]);
			}
			avg = sum/(float)score[i].length;
			System.out.printf("%5d %5.1f\n", sum, avg);
		}
		System.out.println("====================================================");		
		System.out.printf("\t평균 :%4d %4d %4d\n",
				total[0]/score.length, total[1]/score.length, total[2]/score.length);
	}
}

// 5명의 학생 성적처리를 2차원 배열
// 행은 사람 열은 과목