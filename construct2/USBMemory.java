package test.construct2;

public class USBMemory {
	private int capacity;
	private String color;
	
	public int getCapacity() {
		return capacity;
	}
	public String getColor() {
		return color;
	}
	
	public USBMemory(int capacity) {
		this.capacity = capacity;
	}
	
	public USBMemory(int capacity, String color) {
		this(capacity);
		this.color = color;
	}
	
	public void showInfo() {
		System.out.printf("%s, %dGB�� USB �޸�", color, capacity);
	}
	
	public void readUSBMemory() {
		showInfo();
		System.out.println("�� �����͸� �д´�.\n");
	}
	
	public void writeUSBMemory() {
		showInfo();
		System.out.println("�� �����͸� �����Ѵ�.\n");
	}
}
