package test.class3;

public class RunCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setR(5);
		
		Circle c2 = new Circle();
		c2.setR(12);
		
		c1.calcCircum();
		c1.calcArea();
		
		System.out.println("-----------------------------");
		System.out.printf("반지름이 %d인 원의 둘레는 %.3fcm\n", c1.getR(), c1.getCircum());
		System.out.printf("반지름이 %d인 원의 면적은 %.3fcm\n", c1.getR(), c1.getArea());
		System.out.println("-----------------------------");
		
		System.out.println("-----------------------------");
		System.out.printf("반지름이 %d인 원의 둘레는 %.3fcm\n", c2.getR(), c2.getCircum());
		System.out.printf("반지름이 %d인 원의 면적은 %.3fcm\n", c2.getR(), c2.getArea());
		System.out.println("-----------------------------");
	}

}
