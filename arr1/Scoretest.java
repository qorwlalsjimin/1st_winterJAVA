package test.arr1;

import java.util.Scanner;

public class Scoretest {

	public static void main(String[] args) {
		// 성적을 지정할 수 있는 1차원 배열 선언 및 객체생성
		int[] scores = new int[5];
		
		// 키보드로부터 성적을 입력  받기 위해 Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		// 배열의 길이만큼 과목별 성적을 입력받아서 저장하고 전체 합계를 구한다.
		for(int i = 0; i<scores.length; i++) {
			System.out.print((i+1)+"과목 성적 입력 : ");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		
		System.out.println("총합계: "+sum);
		double avg = (double)sum/scores.length;
		System.out.printf("평균 : %.2f", avg);
		sc.close();
	}

}
