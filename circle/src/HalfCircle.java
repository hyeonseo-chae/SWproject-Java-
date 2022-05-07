public class HalfCircle {

	private double radius;
	public static double PI = 3.14;
	private String way;
	static double AreaSum=0;
	
	public HalfCircle(double radius, String way){
	this.radius = radius;
	this.way = way;
	AreaSum += (radius*radius*PI)/2;
	}
	
	public double getradius() {
		
		return radius;
	}
	
	public String getWay() {
		return way;
	}
	
	public double getArea() {
		return radius*radius*PI;
	}
	
	public void resize(double radius) {
		AreaSum -= (this.radius*this.radius*PI)/2;
		this.radius = radius;
		AreaSum += (radius*radius*PI)/2;
	}
	
	public boolean isEquals(double radius, String way) {
		if(this.radius==radius&&this.way.equals(way)) {
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
