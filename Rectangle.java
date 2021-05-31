package areaofshapes;

public class Rectangle  implements Shapes{
	
	int length = 12;
	int width = 10;
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void calculateArea() {
		double area = length*width;
		System.out.println("area of rectangle = " + area);
	}

}
