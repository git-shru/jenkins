package areaofshapes;

public class Circle  implements Shapes{
	
	int radius = 15;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void calculateArea() {
		double area = 3.14*radius*radius;
		System.out.println("area of circle = " + area);
	}

}

