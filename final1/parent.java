package test.final1;

public class Parent {
	//final 필드는 초기화된 값만 사용할 수 있다.
	final int restTime = 10;
	
	public final void rest() {
//		restTime = 20;
		System.out.println(restTime+"10분간 휴식을 한다.");
	}
}
