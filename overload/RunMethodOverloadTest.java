package test.overload;

import java.util.Scanner;

public class RunMethodOverloadTest {

	public static void main(String[] args) {
		MethodOverloadTest ot = new MethodOverloadTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("====�� ���� ���� ====");
		System.out.print("���� �ΰ��� �Է����ּ��� >> ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.printf("%d + %d = %d\n", n1, n2, ot.calc(n1,n2));

		System.out.println("====�� ���� ���� ====");
		System.out.print("�Ǽ� �ΰ��� �Է����ּ��� >> ");
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		System.out.printf("%.1f * %.1f = %.3f\n", n3,n4, ot.calc(n3, n4));
	}

}
