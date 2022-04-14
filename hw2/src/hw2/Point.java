package hw2;

class Point {
	
	double x;
	double y;
	
	Point() {
		this(0.0, 0.0);
	}
	
	Point(double a, double b){
	    this.x = a;
	    this.y = b;
	}
	
	Point midpoint(Point a1, Point b1) {
		this.x = (a1.x + b1.y)/2.0;
		this.y = (a1.x + b1.y) / 2.0;
		return this;
	}
	
	boolean equal(Point k) {
		if(this.x==k.x && this.y==k.y)
			return true;
		else
			return false;
	}
	
	double distance(Point a1, Point b1) {
		this.x = a1.x-b1.x;
		this.y = a1.y-b1.y;
		return Math.sqrt(this.x*this.x + this.y*this.y);
	}
	
	
}