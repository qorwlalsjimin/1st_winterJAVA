package test.class3;

public class Circle {
	private int r;
	private double circum, area;

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public double getCircum() {
		return circum;
	}

	public void setCircum(double circum) {
		this.circum = circum;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void calcCircum() {
		circum = 2*Math.PI*r;
	}
	public void calcArea() {
		area = Math.PI*Math.pow(r, 2);
		
	}
}
