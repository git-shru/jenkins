package areaofshapes;

public class Square implements Shapes{
	
	int side = 4;
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public void calculateArea() {
		double area = side*side;
		System.out.println("area of square = " + area);
	}

}
