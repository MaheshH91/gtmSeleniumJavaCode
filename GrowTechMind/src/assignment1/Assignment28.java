package assignment1;

//AssignmentWAP to find the area of circle by using final variable method
public class Assignment28 {
	double radious = 10.4;
	final static double pi = 3.14;
	
	public double areaOfCircle() {
		double areaCircle = pi* radious *radious;
		return areaCircle;
	}
    public static void main(String[] args) {
    	Assignment28 ref= new Assignment28();
    	System.out.println(ref.areaOfCircle());
    }
}

