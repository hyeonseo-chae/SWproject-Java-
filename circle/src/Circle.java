public class Circle {
	private double radius;
	public static double PI = 3.14;
	
	static double AreaSum=0;
	
	public Circle(double radius){
	this.radius = radius;
	AreaSum += radius*radius*PI;
	}
	
	public double getradius() {
		
		return radius;
	}
	
	public double getArea() {
		return radius*radius*PI;
	}
	
	public void resize(double radius) {
		AreaSum -= this.radius*this.radius*PI;
		this.radius = radius;
		AreaSum += radius*radius*PI;
	}
	
	public boolean isEquals(double radius) {
		if(this.radius==radius) {
			return true;
		}
		else {
			return false;
		}
	}
	public double sum() {
		return AreaSum;
	}
	
}


