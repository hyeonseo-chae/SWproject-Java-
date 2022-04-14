package hw2;

 public class TestPoint{
	public static void main(String[] args) {
		Point p1 = new Point(1.5,1.5);
		Point p2 = new Point(1.5,1.5);
		Point p3 = new Point();
		p3.midpoint(p1, p2);
		
		System.out.println("midpoint = "+p3.x+", "+p3.y);
		System.out.println("distance = "+p3.distance(p1,p2));
		
		if(p1.equal(p2))
			System.out.println("two points are equal");
		else
			System.out.println("two points are different");
		
	}


	
}