package test.arr1;

import java.util.Scanner;

public class Scoretest {

	public static void main(String[] args) {
		// ������ ������ �� �ִ� 1���� �迭 ���� �� ��ü����
		int[] scores = new int[5];
		
		// Ű����κ��� ������ �Է�  �ޱ� ���� Scanner ��ü ����
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		// �迭�� ���̸�ŭ ���� ������ �Է¹޾Ƽ� �����ϰ� ��ü �հ踦 ���Ѵ�.
		for(int i = 0; i<scores.length; i++) {
			System.out.print((i+1)+"���� ���� �Է� : ");
			scores[i] = sc.nextInt();
			sum += scores[i];
		}
		
		System.out.println("���հ�: "+sum);
		double avg = (double)sum/scores.length;
		System.out.printf("��� : %.2f", avg);
		sc.close();
	}

}
