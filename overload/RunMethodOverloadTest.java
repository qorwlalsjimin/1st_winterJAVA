package test.overload;

import java.util.Scanner;

public class RunMethodOverloadTest {

	public static void main(String[] args) {
		MethodOverloadTest ot = new MethodOverloadTest();
		Scanner sc = new Scanner(System.in);
		System.out.println("====두 수의 덧셈 ====");
		System.out.print("정수 두개를 입력해주세요 >> ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.printf("%d + %d = %d\n", n1, n2, ot.calc(n1,n2));

		System.out.println("====두 수의 곱셈 ====");
		System.out.print("실수 두개를 입력해주세요 >> ");
		double n3 = sc.nextDouble();
		double n4 = sc.nextDouble();
		System.out.printf("%.1f * %.1f = %.3f\n", n3,n4, ot.calc(n3, n4));
	}

}
