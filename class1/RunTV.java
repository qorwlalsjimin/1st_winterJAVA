package test.class1;

public class RunTV {

	public static void main(String[] args) {
		TV tv1 = new TV();
		TV tv2 = new TV();
		TV tv3 = new TV();

		tv1.setProducer("LG");
		tv1.setColor("white");
		tv1.setSize(55);
		
		tv2.setProducer("SAMSUNG");
		tv2.setColor("Black");
		tv2.setSize(65);
		
		tv3.setProducer("APPLE");
		tv3.setColor("Silver");
		tv3.setSize(77);
		
		System.out.println("****************************");
		System.out.println(tv1.getProducer()+" TV");
		System.out.println(tv1.getSize()+" ����");
		tv1.powerOn();
		for(int i = 0; i<7; i++) {
			tv1.upChannel();
		}
		for(int i = 0; i<10; i++) {
			tv1.upvolume();
		}
		System.out.println("****************************");

		System.out.println("****************************");
		System.out.println(tv3.getProducer()+" TV");
		System.out.println(tv3.getSize()+" ����");
		tv3.powerOn();
		for(int i = 0; i<11; i++) {
			tv3.upChannel();
		}
		for(int i = 0; i<5; i++) {
			tv3.upvolume();
		}
		tv3.downChannel();
		tv3.downChannel();
		
		tv3.powerOff();
		System.out.println("****************************");
	}

}
