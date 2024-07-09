package ak.cal;

public class LifeCycleAnnotation {

	
	public int square(int a) {
		
		return a*a;
	}
	
	public int cube(int b) {
		
		return b*b*b;
	}
	
	public int positive(int x,int y) {
		
		return x > 0 ? x : y;
	}
}
