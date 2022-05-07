
public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle(1.0);
		Circle c2 = new Circle(2.0);
		
		System.out.println(c1.getArea());
		Circle c3 = new Circle(3.0);
		Circle c4 = new Circle(4.0);
		System.out.println(c4.sum());
		
		c3.resize(5.0);
		System.out.println(c3.getArea());
		System.out.println(c4.sum());
		
		HalfCircle c5 = new HalfCircle(1.0,"LEFT");
		HalfCircle c6 = new HalfCircle(1.0,"RIGHT");
		System.out.println(c6.isEquals(c5.getradius(), c5.getWay()));
		
	}
}
